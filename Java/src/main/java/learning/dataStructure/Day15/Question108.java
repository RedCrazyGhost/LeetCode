package learning.数据结构基础.Day15;

import model.TreeNode;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * @author wenxingzhan
 * @date 2022/01/18 15:08
 **/
public class Question108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0, nums.length-1);
    }
    public TreeNode dfs(int[] arr,int left,int right){
        if (left>right){
            return null;
        }
        int mid=(left-right)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=dfs(arr, left, mid-1);
        node.right=dfs(arr,mid+1,right);

        return node;
    }
}
