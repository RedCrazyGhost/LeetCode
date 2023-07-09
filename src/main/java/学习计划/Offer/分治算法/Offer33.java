package 学习计划.Offer.分治算法;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/05 16:53
 **/
public class Offer33 {
    public boolean verifyPostorder(int[] postorder) {
        return dfs(postorder,0, postorder.length-1);
    }
    private boolean dfs(int[] postorder,int left,int right){
        if (left>=right) return true;
        int index=left;
        while(postorder[index]<postorder[right]) index++;
        int rootIndex=index;
        while(postorder[index]>postorder[right]) index++;

        return index==right && dfs(postorder,index,rootIndex-1) && dfs(postorder,rootIndex,right-1);
    }
}