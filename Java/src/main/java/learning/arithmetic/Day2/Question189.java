package learning.算法入门.Day2;

/**
 * 189. 轮转数组
 *
 * @author wenxingzhan
 * @date 2021/12/26 13:12
 **/
public class Question189 {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];
        for (int j=0,i = nums.length-(k%nums.length); j < nums.length ; i++,j++) {
            arr[j]=nums[i%nums.length];
        }
        System.arraycopy(arr, 0, nums, 0, nums.length);
    }
}
