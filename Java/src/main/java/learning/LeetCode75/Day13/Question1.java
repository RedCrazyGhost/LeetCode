package learning.LeetCode75.Day13;

/**
 * 1. 两数之和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/08 16:18
 **/
public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        int len= nums.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
