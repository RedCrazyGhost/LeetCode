package daily;

/**
 * 1800. 最大升序子数组和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/07 11:55
 **/
public class Question1800 {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0],num=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]<nums[i]){
                num+=nums[i];
            }else{
                max=Math.max(max,num);
                num=nums[i];
            }
        }
        max=Math.max(max,num);
        return max;
    }
}
