package 每日一题;

import 数据结构模型.TreeNode;

/**
 * 700. 二叉搜索树中的搜索
 *
 * @author wenxingzhan
 * @date 2021/11/17 16:51
 **/
public class Question700 {
        TreeNode target=null;
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null){
            return null;
        }
        function(root, val);
        return target;
    }
    public void function(TreeNode node,int val){
        if (node.val==val){
            if (node.left!=null||node.right!=null){
                target=node;
            }
        }else {
            if (node.left != null) {
              function(node.left, val);
            }
            if (node.right != null) {
              function(node.right, val);
            }
        }
    }
}
