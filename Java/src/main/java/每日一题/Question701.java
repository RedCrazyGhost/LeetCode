package 每日一题;

import 数据结构模型.TreeNode;

/**
 * 701. 二叉搜索树中的插入操作
 *
 * @author wenxingzhan
 * @date 2021/11/17 17:38
 **/
public class Question701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null){
            return new TreeNode(val);
        }
        function(root, val);
        return root;
    }
    public void function(TreeNode node,int val){
        if (node.val<val){
            if (node.right==null){
                node.right=new TreeNode(val);
            }else{
                function(node.right,val);
            }
        }else{
            if (node.left==null){
                node.left=new TreeNode(val);
            }else{
                function(node.left,val);
            }

        }
    }
}
