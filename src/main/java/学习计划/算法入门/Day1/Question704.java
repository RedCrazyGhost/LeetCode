package 学习计划.算法入门.Day1;

/**
 * 704. 二分查找
 *  重写
 * @author wenxingzhan
 * @date 2021/11/08 19:03
 **/
public class Question704 {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end) {
            int index =start +(end - start) /2;
            if (nums[index] == target){
                return index;
            }else if (nums[index] < target) {
                start = index + 1;
            } else {
                end=index-1;
            }
        }
       return -1;
    }
}
