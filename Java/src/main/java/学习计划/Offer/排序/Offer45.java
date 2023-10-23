package 学习计划.Offer.排序;

import java.util.*;

/**
 * 剑指 Offer 45. 把数组排成最小的数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/07 14:07
 **/
public class Offer45 {
    public String minNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(x,y)->(x+y).compareTo(y+x));
        StringBuilder stringBuilder=new StringBuilder();
        for (String s : arr) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
