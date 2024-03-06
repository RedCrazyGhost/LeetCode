package daily;

import 数据结构模型.TreeNode;

/**
 * 1448. 统计二叉树中好节点的数目
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/25 15:48
 **/
public class Question1448 {
    public int goodNodes(TreeNode root) {
        if (root==null) return 0;
        return dfs(root,Integer.MIN_VALUE);
    }
    private int dfs(TreeNode node,int rootValue){
        int nodeNum=0;
        if (node.left!=null) nodeNum+=dfs(node.left,Math.max(rootValue,node.val));
        if (node.right!=null) nodeNum+=dfs(node.right,Math.max(rootValue,node.val));
        if (node.val>=rootValue) nodeNum+=1;
        return nodeNum;
    }
}
