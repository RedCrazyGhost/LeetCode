package daily;

import 数据结构模型.TreeNode;

/**
 * 98. 验证二叉搜索树
 *
 * @author wenxingzhan
 * @date 2021/11/13 16:03
 **/
public class Question98 {
    public boolean isValidBST(TreeNode root) {
       return function(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean function(TreeNode node,long min,long max){
       if(node==null){
           return true;
       }
       if (node.val<=min||node.val>=max){
           return false;
       }
        return function(node.left,min,node.val)&&function(node.right,node.val,max);
    }
}
