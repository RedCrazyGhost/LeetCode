package daily;

import model.TreeNode;

import java.util.*;

/**
 * 102. 二叉树的层序遍历
 *
 * @author wenxingzhan
 * @date 2021/11/13 14:11
 **/
public class Question102 {
    List<List<Integer>> list;
    Map<Integer,List<Integer>> map;
    public List<List<Integer>> levelOrder(TreeNode root) {
        list=new ArrayList<>();
        map=new HashMap<>();
        if (root==null){
            return list;
        }
        function(root,0);
        for (int i = 0; i < map.size(); i++) {
            list.add(map.get(i));
        }

        return list;


    }
    public void function(TreeNode node, int i){
        map.put(i, map.getOrDefault(i, new ArrayList<>()));
        map.get(i).add(node.val);
        i+=1;
        if (node.left!=null){
            function(node.left,i);
        }
        if (node.right!=null){
            function(node.right,i);
        }
    }
}
