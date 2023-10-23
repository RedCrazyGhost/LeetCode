package 学习计划.Offer.排序;

import java.util.Arrays;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/07 14:42
 **/
public class Offer61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int kingNum=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==0){
                kingNum+=1;
            }else if (nums[i]!=nums[i+1] && nums[i+1]-nums[i]-1<=kingNum){
                kingNum-=nums[i+1]-nums[i]-1;
            }else{
                return false;
            }
        }
        return true;
    }
}
