package 学习计划.LeetCode75.Day8;

import 数据结构模型.TreeNode;

/**
 * 98. 验证二叉搜索树
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/03 12:27
 **/
public class Question98 {
    public boolean isValidBST(TreeNode root) {
        return dfs(root,Long.MIN_VALUE, Long.MAX_VALUE);

    }
    private boolean dfs(TreeNode node,long min,long max){
        if (node==null){
            return true;
        }
        if (node.val<=min||node.val>=max){
            return false;
        }

        return dfs(node.left,min,node.val)&&dfs(node.right,node.val,max);
    }
}
