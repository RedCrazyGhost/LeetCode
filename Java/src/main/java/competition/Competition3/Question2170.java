package competition.Competition3;

import java.util.*;
import java.util.stream.Stream;

/**
 * 2170. 使数组变成交替数组的最少操作数
 *
 * @author wenxingzhan
 * @date 2022/03/15 19:41
 **/
public class Question2170 {
    public int minimumOperations(int[] nums) {
        Map<Integer,Integer>map0=new HashMap<>();
        Map<Integer,Integer>map1=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                map0.put(nums[i],map0.getOrDefault(nums[i],0)+1 );
            }else{
                map1.put(nums[i],map1.getOrDefault(nums[i],0)+1 );
            }
        }

        int[][] arr0=top2(map0);
        int[][] arr1=top2(map1);
        if (arr0[0][0]!=arr1[0][0]){
            return nums.length-arr0[0][1]-arr1[0][1];
        }else{
            return nums.length-Math.max(arr0[0][1]+arr1[1][1],arr0[1][1]+arr1[0][1]);
        }
    }
    public int[][] top2(Map<Integer,Integer> map){
        int[][] arr=new int[2][2];
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (entry.getValue()>arr[0][1]){
                if (arr[0][0]!=0) {
                    arr[1][0]=arr[0][0];
                    arr[1][1]=arr[0][1];
                }
                arr[0][0] = entry.getKey();
                arr[0][1] = entry.getValue();
            } else if (entry.getValue()>arr[1][1]){
                arr[1][0]=entry.getKey();
                arr[1][1]=entry.getValue();
            }
        }
        return arr;
    }


}
