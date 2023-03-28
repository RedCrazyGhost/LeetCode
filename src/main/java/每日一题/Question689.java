package 每日一题;

import java.util.*;

/**
 * 689. 三个无重叠子数组的最大和
 *
 * @author wenxingzhan
 * @date 2021/12/08 09:01
 **/
public class Question689 {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <= nums.length-k; i++) {
            for (int j = i; j < i+k; j++) {
                map.put(i,map.getOrDefault(i,0)+3*nums[j]);
            }
        }
        //这里将map.entrySet()转换成list
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }

        });

        int[] arr=new int[3];
        top:  for (int i = 0; i < list.size(); i++) {
            Map.Entry<Integer,Integer> mapping=list.get(i);
            for (int j = 0; j < 3; j++) {
                if(mapping.getKey()>arr[j]&&mapping.getKey()<arr[j]+k){
                    break top;
                }
            }

        }
        return null;
    }
}
