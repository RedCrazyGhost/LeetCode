package daily;

import java.util.Arrays;

/**
 * 915. 分割数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/08 14:12
 **/
public class Question915 {
    public int partitionDisjoint(int[] nums) {
        int max=nums[0],lmax=nums[0],index=0;
        for (int i = 0; i < nums.length; i++) {
            max=Math.max(max,nums[i]);
            if (nums[i]<lmax){
                lmax=max;
                index=i;
            }
        }
        return index+1;
    }
//    网友一次遍历
//    public int partitionDisjoint(int[] nums) {
//        int len = nums.length;
//        int max = nums[0], leftMax = nums[0];
//        int pos = 0;
//        for(int i = 0; i < len; i++){
//            max = Math.max(max, nums[i]);
//            if(nums[i] < leftMax) {
//                leftMax = max;
//                pos = i;
//            }
//        }
//        return pos+1;
//    }
//    public int partitionDisjoint(int[] nums) {
//        int len=nums.length,lmax=nums[0],rmin=nums[len-1];
//        int[] num1=new int[len],num2=new int[len];
//        for (int i = 0; i < len; i++) {
//            num1[i]=lmax=Math.max(lmax, nums[i]);
//            num2[len-1-i]=rmin=Math.min(rmin,nums[len-1-i]);
//        }
//        System.out.println(Arrays.toString(num1));
//        System.out.println(Arrays.toString(num2));
//        System.out.println(Arrays.toString(nums));
//
//
//        for (int i = 1; i < len; i++) {
//            if (num1[i-1]<=num2[i]){
//                return i;
//            }
//        }
//        return len-1;
//    }
}
