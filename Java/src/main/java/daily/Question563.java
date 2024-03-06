package daily;

import model.TreeNode;

/**
 * 563. 二叉树的坡度
 *
 * @author wenxingzhan
 * @date 2021/11/18 12:57
 **/
public class Question563 {
    int sum=0;
    public int findTilt(TreeNode root) {
        function(root);
        return sum;
    }

    public int function(TreeNode node) {
        if (node==null){
            return 0;
        }

        int l=function(node.left);
        int r=function(node.right);
        sum+=Math.abs(l-r);
        return  node.val+l+r;

    }
}
