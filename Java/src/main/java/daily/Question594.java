package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 594. 最长和谐子序列
 *
 * @author wenxingzhan
 * @date 2021/11/20 11:15
 **/
public class Question594 {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int max=0;
        for(int i:map.keySet()){
            if ( map.getOrDefault(i-1,0)!=0) {
                max = Math.max(map.getOrDefault(i - 1, 0) + map.get(i), max);
            }
            if (map.getOrDefault(i+1,0)!=0){
            max=Math.max( map.getOrDefault(i+1,0)+map.get(i),max);}
        }
        return max;
    }

}
