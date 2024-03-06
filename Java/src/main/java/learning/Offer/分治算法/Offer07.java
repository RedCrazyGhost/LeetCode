package learning.Offer.分治算法;

import 数据结构模型.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 07.重建二叉树
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/05 15:27
 **/
public class Offer07 {
    int[] preorder;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return dfs(0,0,inorder.length-1);
    }
    private TreeNode dfs(int rootIndexP,int leftIndex,int rightindex){
        if (leftIndex>rightindex) return null;
        int rootValue=preorder[rootIndexP];
        int rootIndexI=map.get(rootValue);
        TreeNode node=new TreeNode(rootValue);
        node.left=dfs(rootIndexP+1,leftIndex,rootIndexI-1);
        node.right=dfs(rootIndexP+rootIndexI-leftIndex+1,rootIndexI+1,rightindex);
        return node;
    }
}
