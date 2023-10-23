package 每日一题;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1403. 非递增顺序的最小子序列
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/19 20:49
 **/
public class Question1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int left=0,right= nums.length-1;
        int leftnum=0,rightnum=0;
        while (left<=right){
            if (rightnum<=leftnum) {
                list.add(nums[right]);
                rightnum += nums[right--];
            }else{
                leftnum+=nums[left++];
            }
        }
        if (rightnum==leftnum){
            list.add(nums[right]);
        }
        return list;
    }
}
