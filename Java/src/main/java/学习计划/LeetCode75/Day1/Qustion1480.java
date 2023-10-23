package 学习计划.LeetCode75.Day1;

/**
 * 1480. 一维数组的动态和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/3/29 15:28
 **/
public class Qustion1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
