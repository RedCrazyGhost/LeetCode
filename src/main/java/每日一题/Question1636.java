package 每日一题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1636. 按照频率将数组升序排序
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/19 13:14
 **/
public class Question1636 {
    public int[] frequencySort(int[] nums) {
        int[] arr=new int[201];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]+100]+=1;
        }
        int index=0;
        for (int j = 1; j <= 100; j++) {
            for (int i = arr.length-1; i >-1; i--) {
                if (arr[i] == j) {
                    Arrays.fill(nums, index, index + arr[i], i - 100);
                    index += arr[i];
                }
                if (index == nums.length - 1) {
                    break;
                }
            }
        }
        return nums;
    }
}
