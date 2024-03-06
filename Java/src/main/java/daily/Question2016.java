package daily;

/**
 * 2016. 增量元素之间的最大差值
 *
 * @author wenxingzhan
 * @date 2022/02/26 21:30
 **/
public class Question2016 {
    public int maximumDifference(int[] nums) {
//        暴力循环
        int num=-1;
        for (int i = nums.length-1; i >0 ; i--) {
            for (int j = i-1; j >-1 ; j--) {
                num=Math.max(num,nums[i]-nums[j]);
            }
        }
        return num<=0?-1:num;
    }
}
