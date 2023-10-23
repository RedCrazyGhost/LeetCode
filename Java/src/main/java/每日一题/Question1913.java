package 每日一题;

import java.util.Arrays;

/**
 * 1913. 两个数对之间的最大乘积差
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/29 19:39
 **/
public class Question1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[1]*nums[0]);
    }
}
