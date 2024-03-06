package learning.LeetCode75.Day6;

import 数据结构模型.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/01 21:35
 **/
public class Question102 {
    HashMap<Integer,List<Integer>> map;
    public List<List<Integer>> levelOrder(TreeNode root) {
        map=new HashMap<>();
        dfs(root,0);
        return new ArrayList<List<Integer>>(map.values());
    }
    
    private void dfs(TreeNode node,int deep){
        if (node!=null){
            List<Integer> level = map.getOrDefault(deep, new ArrayList<>());
            level.add(node.val);
            map.put(deep,level);
            if (node.left!=null){
                dfs(node.left,deep+1);
            }
            if (node.right!=null){
                dfs(node.right,deep+1);
            }
        }
    }
}
