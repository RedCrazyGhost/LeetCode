package 学习计划.LeetCode75.Day8;

import 数据结构模型.TreeNode;

/**
 * 235. 二叉搜索树的最近公共祖先
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/03 13:37
 **/
public class Question235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val<p.val&&root.val<q.val)return lowestCommonAncestor(root.right,p,q);
        if (root.val>p.val&&root.val>q.val)return lowestCommonAncestor(root.left,p,q);
        return root;
    }
}
