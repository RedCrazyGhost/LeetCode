package 每日一题;

import java.util.Arrays;

/**
 * 2279. 装满石头的背包的最大数量
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/14 15:41
 **/
public class Question2279 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int num=0;
        for (int i = 0; i < capacity.length; i++) {
            capacity[i]-=rocks[i];
        }
        Arrays.sort(capacity);
        for (int i = 0; i < capacity.length; i++) {
           if (additionalRocks-capacity[i]>=0){
               num+=1;
           }else{
               break;
           }
           additionalRocks-=capacity[i];
        }



        return num;
    }
}
