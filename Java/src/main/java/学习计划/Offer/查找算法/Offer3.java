package 学习计划.Offer.查找算法;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 03.数组中重复的数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/28 16:34
 **/
public class Offer3 {
//    public int findRepeatNumber(int[] nums){
//        Arrays.sort(nums);
//        int i = 0;
//        while (i < nums.length-1&&nums[i]!=nums[i+1]) {
//            i++;
//        }
//        return i==nums.length-1?-1:nums[i];
//    }
    public int findRepeatNumber(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            boolean flag=set.add(i);
            if (!flag){
                return i;
            }
        }
        return -1;
    }

}
