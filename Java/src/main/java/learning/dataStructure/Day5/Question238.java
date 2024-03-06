package learning.数据结构基础.Day5;

/**
 * 238. 除自身以外数组的乘积
 *
 * @author wenxingzhan
 * @date 2022/01/11 19:38
 **/
public class Question238 {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int num=1;
        for (int i = 0; i < nums.length; i++) {
            arr[i]=1;
            arr[i]*=num;
            num*=nums[i];
        }
        num=1;
        for (int i = nums.length-1; i >-1; i--) {
            arr[i]*=num;
            num*=nums[i];
        }


        return arr;
    }
}
