package 每日一题;

/**
 * 2104. 子数组范围和
 *
 * @author wenxingzhan
 * @date 2022/03/04 14:21
 **/
public class Question2104 {
    public long subArrayRanges(int[] nums) {
//       暴力   最优解法（单调栈）
        int  len= nums.length;
        long num = 0;
        for (int i = 0; i < len; i++) {
            int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            for (int j = i; j < len; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                num += maxVal - minVal;
            }
        }
        return num;
    }
}
