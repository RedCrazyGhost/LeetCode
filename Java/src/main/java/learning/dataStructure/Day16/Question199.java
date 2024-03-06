package learning.数据结构基础.Day16;

import model.TreeNode;

import java.util.*;

/**
 * 199. 二叉树的右视图
 *
 * @author wenxingzhan
 * @date 2022/01/21 14:23
 **/
public class Question199 {
    Map<Integer,Integer>map=new HashMap<>();
    public List<Integer> rightSideView(TreeNode root) {

        dfs(root,0);

        return new ArrayList<>(map.values());
    }
    public void dfs(TreeNode node,int deep){
        if(node!=null){
            map.put(deep,map.getOrDefault(deep,null)!=null?map.get(deep):node.val);
            if (node.right!=null){
                dfs(node.right,deep+1);
            }
            if (node.left!=null){
                dfs(node.left,deep+1);
            }
        }
    }
}
