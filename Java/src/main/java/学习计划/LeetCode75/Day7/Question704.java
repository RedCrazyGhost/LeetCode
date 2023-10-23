package 学习计划.LeetCode75.Day7;

/**
 * 704. 二分查找
 * 1 7 10  target=8
 * 0   2  -> middel =1
 *     2  -> middel =2
 *   1 2  -> middel =1
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/02 12:00
 **/
public class Question704 {
    public int search(int[] nums, int target) {
        int left=0,right = nums.length-1;
        while(left<=right){
            int mid=(right-left)/2+left;
            int num=nums[mid];
            if (num==target){
                return mid;
            }else if (num>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
