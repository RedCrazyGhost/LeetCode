package daily;

import model.TreeNode;

/**
 * 104. 二叉树的最大深度
 *
 * @author wenxingzhan
 * @date 2021/11/13 14:47
 **/
public class Question104 {
    public int maxDepth(TreeNode root) {

        if (root==null){
            return 0;
        }
        return function(root,1);
    }
    public int function(TreeNode node,int i){
        int max=i;
        i+=1;
        if (node.left!=null){
            max=Math.max(max,function(node.left,i));
        } if (node.right!=null){
            max=Math.max(max,function(node.right,i));
        }
        return max;
    }
}
