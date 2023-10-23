package 学习计划.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

/**
 * 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/04 16:17
 **/
public class Offer68I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return null;
        }

        if (root.val > p.val && root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if (root.val < p.val && root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
