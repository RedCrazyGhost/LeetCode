package learning.Offer.动态规划;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/11 14:04
 **/
public class Offer42 {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=Math.max(nums[i-1],0 );
            res=Math.max(res,nums[i]);
        }
        return res;
    }
}
