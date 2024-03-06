package learning.Offer.双指针;

/**
 * 剑指 Offer 57. 和为s的两个数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/31 15:17
 **/
public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int[] arr=new int[]{nums[left],nums[right]};
        while(arr[0]+arr[1]!=target){
            if (arr[0]+arr[1]>target){
                arr[1]=nums[--right];
            }else if (arr[0]+arr[1]<target){
                arr[0]=nums[++left];
            }
        }
        return arr;
    }
}
