package learning.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/01 17:43
 **/
public class Offer34 {
    int sum=0,target=0;
    Stack<Integer> stack=new Stack<>();
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        this.target=target;
        if (root!=null) {
            dfs(root);
        }
        return list;
    }
    private void dfs(TreeNode node){
        stack.add(node.val);
        sum+=node.val;
        if (node.left==null&&node.right==null&&sum==target){
            list.add(new ArrayList<>(stack));
        }
        if (node.left!=null){
            dfs(node.left);
            sum-=stack.pop();
        }
        if (node.right!=null){
            dfs(node.right);
            sum-=stack.pop();
        }
    }
}
