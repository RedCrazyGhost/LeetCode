package 每日一题;

/**
 * 713. 乘积小于 K 的子数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/05 12:33
 **/
public class Question713 {
    //    滑动数组
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int num = 1;
        int sum = 0;
        int left = 0, right = 0;
        while (right < nums.length) {
            num *= nums[right++];
            while (left < right && num >= k) {
                num /= nums[left++];
            }
            sum += (right - left);
        }

        return sum;
    }
}
