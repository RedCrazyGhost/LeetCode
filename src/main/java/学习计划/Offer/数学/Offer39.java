package 学习计划.Offer.数学;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 39. 数组中出现次数超过一半的数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/09 15:35
 **/
public class Offer39 {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            Integer res = map.getOrDefault(num, 0);
            if (res+1>nums.length/2){
                return num;
            }
            map.put(num,res  + 1);
        }
        return -1;
    }
}
