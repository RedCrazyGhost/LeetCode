package competition.Competition3;

import java.util.Arrays;

/**
 * 2171. 拿出最少数目的魔法豆
 *
 * @author wenxingzhan
 * @date 2022/03/15 20:52
 **/
public class Question2171 {
    public long minimumRemoval(int[] beans) {
//       暴力解法 时间复杂度太高
//        Arrays.sort(beans);
//        long min= Long.MAX_VALUE;
//        for (int i = 0; i < beans.length; i++) {
//            long sum=0,num=beans[i];
//            for (int j = 0; beans[j]!=num; j++) {
//                sum+=beans[j];
//            }
//            for (int j = i+1; j < beans.length ; j++) {
//                sum+=beans[j]-num;
//            }
//            min=Math.min(sum,min);
//        }
//        return min;
        
        
        
//      最优解
        Arrays.sort(beans);
        long sum=0,min= Long.MAX_VALUE;
        for(int i:beans){
            sum+=i;
        }
        for (int i = 0; i < beans.length; i++) {
            long num=sum-(long)beans[i]*(beans.length-i);
            min=Math.min(num,min);
        }
        return min;
    }
}
