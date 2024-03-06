package daily;

import java.util.Arrays;

/**
 * 1464. 数组中两元素的最大乘积
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/08/26 16:10
 **/
public class Question1464 {
    public int maxProduct(int[] nums) {
        int a = -1;
        int b = -1;
        for(int num : nums){
            if(num > a){
                b = a;
                a = num;
            }else if(num > b){
                b = num;
            }
        }
        return (a - 1) * (b - 1);
    }
}
