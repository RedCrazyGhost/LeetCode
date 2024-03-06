package learning.数据结构基础.Day2;

/**
 * 75. 颜色分类
 *
 * @author wenxingzhan
 * @date 2021/12/31 13:21
 **/
public class Question75 {
    public void sortColors(int[] nums) {
        int[] arr=new int[3];
        for (int num : nums) {
            arr[num] += 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i<arr[0]){
                nums[i]=0;
            }else if (i<arr[1]+arr[0]){
                nums[i]=1;
            }else {
                nums[i]=2;
            }
        }
    }
}
