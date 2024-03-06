package learning.Offer.搜索与回溯算法;

import model.TreeNode;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/03 16:21
 **/
public class Offer54 {
    int target,k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return target;
    }
    private void dfs(TreeNode node){
        if (node.right!=null) {
            dfs(node.right);
        }
        if ((k-=1)==0){
            target=node.val;
        }
        if (node.left!=null) {
            dfs(node.left);
        }
    }
}
