package daily;

import model.TreeNode;

/**
 * 226. 翻转二叉树
 *
 * @author wenxingzhan
 * @date 2021/11/17 16:00
 **/
public class Question226 {
    public TreeNode invertTree(TreeNode root) {
        if (root!=null) {
            function(root);
        }
        return root;
    }
    public void function(TreeNode node){
        if (node.right!=null&&node.left!=null){
            TreeNode temp= node.left;
            node.left=node.right;
            function(node.left);
            node.right=temp;
            function(node.right);
        } else if (node.right!=null&&node.left==null){
            node.left=node.right;
            node.right=null;
            function(node.left);
        }else if (node.right==null&&node.left!=null){
            node.right=node.left;
            node.left=null;
            function(node.right);
        }
    }
}
