package learning.数据结构基础.Day5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 334. 递增的三元子序列
 *
 * @author wenxingzhan
 * @date 2022/01/12 19:15
 **/
public class Question334 {
    public boolean increasingTriplet(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        arr1[0]=nums[0];
        int maxIndex=0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]>arr1[maxIndex]){
                arr1[++maxIndex]=nums[i];
            }
        }
        System.out.println(Arrays.toString(arr1));

        return false;
    }
}
