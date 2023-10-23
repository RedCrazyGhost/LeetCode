package 学习计划.Offer.查找算法;

/**
 * 剑指 Offer 53 .缺失的数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/28 17:05
 **/
public class Offer53 {
    public int missingNumber(int[] nums) {
        int num=(1+nums.length)*nums.length/2;
        for(int i:nums){
            num-=i;
        }
        return num;
    }
}
