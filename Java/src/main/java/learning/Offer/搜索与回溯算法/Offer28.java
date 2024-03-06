package learning.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

/**
 * 剑指 Offer 28. 对称的二叉树
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/30 17:27
 **/
public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root,root);
    }
    private boolean dfs(TreeNode left,TreeNode right){
        if (left==null && right==null){
            return true;
        }
        if (left==null || right==null){
            return false;
        }
        return left.val==right.val&&dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}
