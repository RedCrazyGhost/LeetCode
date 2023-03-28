package 竞赛.Competition1;

import java.util.HashMap;
import java.util.Map;

/**
 * 2190. 数组中紧跟 key 之后出现最频繁的数字
 *
 * @author wenxingzhan
 * @date 2022/03/09 10:03
 **/
public class Question2190 {
    public int mostFrequent(int[] nums, int key) {
//        Map<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==key&&i!=nums.length-1){
//                map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
//            }
//        }
//        int target=0,max=0;
//        for (Integer integer : map.keySet()) {
//            int num=map.get(integer);
//            if (max<num){
//                max=num;
//                target=integer;
//            }
//        }
//        return target;

//      时间最优解
        int[] arr = new int[1001];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i]==key){
                arr[nums[i+1]]+=1;
            }
        }
        int index=0,max=0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}
