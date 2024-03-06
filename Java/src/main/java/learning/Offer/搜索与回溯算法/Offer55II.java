package learning.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

/**
 * 剑指 Offer 55 - II. 平衡二叉树
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/03 16:48
 **/
public class Offer55II {
    public boolean isBalanced(TreeNode root) {
        return height(root)>=0;
    }
    public int height(TreeNode node) {
        if (node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        if (left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }else{
            return Math.max(left,right)+1;
        }
    }
}
