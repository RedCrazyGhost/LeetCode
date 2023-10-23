package 学习计划.算法入门.Day1;

/**
 * 35. 搜索插入位置
 *
 * @author wenxingzhan
 * @date 2021/12/25 16:38
 **/
public class Question35 {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int index=start +(end - start) /2;
        if (nums[start]<=target&&nums[end]>=target) {
            while (start <= end) {
                if (nums[index] == target) {
                    return index;
                } else if (nums[index] > target) {
                    end = index - 1;
                } else {
                    start = index + 1;
                }
                index =start +(end - start) /2;
            }
            return index;
        }else if(nums[start]>target){
            return 0;
        }else{
            return nums.length;
        }
    }
}
