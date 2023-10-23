package 每日一题;

/**
 * 1920. 基于排列构建数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/22 17:59
 **/
public class Question1920 {
    public int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}
