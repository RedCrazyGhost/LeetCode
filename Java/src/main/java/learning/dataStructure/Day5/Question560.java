package learning.数据结构基础.Day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为 K 的子数组
 *
 * @author wenxingzhan
 * @date 2022/01/12 18:55
 **/
public class Question560 {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       int num=0,sum=0;
        for(int i:nums){
            sum+=i;
            if (map.containsKey(sum-k)){
                num+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return num;
    }
}
