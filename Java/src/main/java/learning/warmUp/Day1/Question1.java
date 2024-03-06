package learning.备战热身.Day1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/3/29 15:28
 **/
public class Question1 {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[i] + nums[j]) == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }


        public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
               int num= target-nums[i];
                if (!map.containsKey(num)) {
                    map.put(nums[i],i);
                }else {
                    return new int[]{i,map.get(num)};
                }
            }
        return null;
    }

}
