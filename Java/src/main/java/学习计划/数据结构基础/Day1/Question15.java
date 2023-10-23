package 学习计划.数据结构基础.Day1;

import java.util.*;

/**
 * 15. 三数之和
 *
 * @author wenxingzhan
 * @date 2021/12/28 21:16
 **/
public class Question15 {
    Set<List<Integer>> set=new LinkedHashSet<>();
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length>=3) {
            Arrays.sort(nums);
            for (int i = 0; i< nums.length-2&&nums[i]<=0; i++) {
               int target=-nums[i];
               int left=i+1;
               int right= nums.length-1;
                while(left<right){
                    if (nums[left]+nums[right]==target){
                        set.add(new ArrayList<>(List.of(nums[i],nums[left],nums[right])));
                        left+=1;
                        right-=1;
                        while (left < right && nums[left] == nums[left - 1]) left+=1;
                        while (left < right && nums[right] == nums[right + 1]) right-=1;
                    }else if (nums[left]+nums[right]<target){
                        left+=1;
                    }else{
                        right-=1;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
