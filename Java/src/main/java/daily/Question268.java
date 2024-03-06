package daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 268. 丢失的数字
 *
 * @author wenxingzhan
 * @date 2021/11/06 10:55
 **/
public class Question268 {
    public int missingNumber(int[] nums) {
//        int[] arr=new int[nums.length+1];
//        for (int i = 0; i < nums.length; i++) {
//            arr[nums[i]]=-1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]!=-1){
//                return i;
//            }
//        }
//        return 0;

//        Map<Integer,Integer> map=new HashMap<>();
//        for (int i:nums) {
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        for (int i = 0; i <= nums.length; i++) {
//            if(map.getOrDefault(i,0)==0){
//                return i;
//            }
//        }
//        return 0;

        Arrays.sort(nums);
        for (int i = 0; i <nums.length; i++) {
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
