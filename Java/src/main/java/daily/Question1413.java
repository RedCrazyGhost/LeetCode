package daily;

import java.util.Map;

/**
 * 1413. 逐步求和得到正数的最小值
 *
 * @author wenxingzhan
 * @date 2022/03/14 13:40
 **/
public class Question1413 {
    public int minStartValue(int[] nums) {
        int min=Integer.MAX_VALUE,sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            min= Math.min(sum,min);
        }
        if (min>0){
            return 1;
        }else{
            return (min*-1)+1;
        }
    }
}
