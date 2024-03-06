package learning.Offer.搜索与回溯算法;

import model.TreeNode;

/**
 * 剑指 Offer 27. 二叉树的镜像
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/30 17:16
 **/
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode node=new TreeNode(root.val);
        if (root.left!=null){
            node.right= mirrorTree(root.left);
        }
        if (root.right!=null){
            node.left= mirrorTree(root.right);
        }

        return node;
    }
}
