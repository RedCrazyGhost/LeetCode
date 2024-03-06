package daily;

import 数据结构模型.TreeNode;

/**
 * 101. 对称二叉树
 *
 * @author wenxingzhan
 * @date 2021/11/13 15:08
 **/
public class Question101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return false;
        }
        if (root.right!=null&& root.left!=null){
            return function(root.left,root.right);
        }
        return root.right == null && root.left == null;
    }
    public boolean function(TreeNode l, TreeNode r){
        if(r==null&&l==null){
            return  true;
        }
        if (r==null||l==null){
            return false;
        }
        return l.val==r.val&&function(l.left,r.right)&&function(l.right,r.left);
    }
}
