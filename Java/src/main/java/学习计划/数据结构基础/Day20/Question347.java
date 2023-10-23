package 学习计划.数据结构基础.Day20;

import java.util.*;
import java.util.stream.Stream;

/**
 * 347. 前 K 个高频元素
 *
 * @author wenxingzhan
 * @date 2022/01/25 20:53
 **/
public class Question347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for (int i :nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list=new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int[] arr=new int[k];
        for (int i = 0; i < k; i++) {
            arr[i]=list.get(i).getKey();
        }
        return arr;
    }
}
