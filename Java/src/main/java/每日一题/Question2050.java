package 每日一题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2050 {
    public int minimumTime(int n, int[][] relations, int[] time) {
//        方向可能有问题
        Map<Integer, Integer> map=new HashMap<>();
        int sum=0,end=0;

        for (int i = 0; i < relations.length; i++) {
            map.put(relations[i][1],Math.max(map.getOrDefault(relations[i][1],0) ,time[relations[i][0]-1]));
        }

        for (Integer i:map.keySet()){
            end=Math.max(end,i);
           sum+=map.get(i);
        }
        if (map.isEmpty()){
            int max=0;
            for (int i:time) {
              max=Math.max(i,max);
            }
            return max;
        }else{
            sum+=time[end-1];
        }

        return sum;

    }
}
