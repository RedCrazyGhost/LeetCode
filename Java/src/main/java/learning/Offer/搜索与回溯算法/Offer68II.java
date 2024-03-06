package learning.Offer.搜索与回溯算法;

import model.TreeNode;

/**
 * 剑指 Offer 68 - II. 二叉树的最近公共祖先
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/04 16:32
 **/
public class Offer68II {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return null;
        }
        if (root==p || root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left!=null && right!=null){
            return root;
        }
        if (left!=null){
            return left;
        }
        return right;
    }
}
