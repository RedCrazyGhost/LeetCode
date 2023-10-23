package 每日一题;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
//        if(nums.length==2){
//            arr[1]=1;
//        }else{
//
//            for (int i = 0; i < nums.length; i++) {
//                for(int j=i+1;j<nums.length;j++){
//                    if(nums[i]+nums[j]==target){
//                        arr[0]=i;
//                        arr[1]=j;
//                    }
//                }
//            }
//        }

        if(nums.length==2){
            arr[1]=1;
        }else {
            Map<Integer,Integer> map =new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(target-nums[i])){
                    arr[0]=map.get(target-nums[i]);
                    arr[1]=i;
                }else {
                    map.put(nums[i],i);
                }
            }
        }
        return arr;
    }
}
