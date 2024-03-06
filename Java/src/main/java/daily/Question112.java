package daily;

import model.TreeNode;

/**
 * 112. 路径总和
 *
 * @author wenxingzhan
 * @date 2021/11/17 15:42
 **/
public class Question112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return function(root,0,targetSum);
    }

    public boolean function(TreeNode node, int number, int targetSum){
        boolean flag=false;
        if (node.left==null&&node.right==null){
            return number==targetSum;
        }
        if (node.left!=null){
            flag= flag||function(node.left,number+node.left.val,targetSum);
        }
        if(node.right!=null){
            flag= flag||function(node.right,number+node.right.val,targetSum);
        }
       return flag;
    }
}
