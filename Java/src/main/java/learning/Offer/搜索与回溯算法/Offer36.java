package learning.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

/**
 * 剑指 Offer 36. 二叉搜索树与双向链表
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/02 22:45
 **/
public class Offer36 {
    TreeNode head,mid;
    public TreeNode treeToDoublyList(TreeNode root) {
        if (root==null) return null;
        dfs(root);
        head.left=mid;
        mid.right=head;
        return head;
    }
    private void dfs(TreeNode node){
        if (node==null) return;
        dfs(node.left);
        if (mid!=null){
            mid.right=node;
        }else{
            head=node;
        }
        node.left=mid;
        mid=node;
        dfs(node.right);
    }
}
