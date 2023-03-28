package top100;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1. 两数之和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/01/08 17:48
 * @思考 使用额外空间存储需要匹配数值目标，将O(n^2)的时间复杂度降为O(n)
 **/
public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int index=map.getOrDefault(target-nums[i],-1);
            if (index!=-1){
                return new int[]{index,i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
