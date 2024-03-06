package learning.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/03 16:41
 **/
public class Offer55I {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
