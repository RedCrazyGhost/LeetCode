package 每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2089. 找出数组排序后的目标下标
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/01 21:08
 **/
public class Question2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}
