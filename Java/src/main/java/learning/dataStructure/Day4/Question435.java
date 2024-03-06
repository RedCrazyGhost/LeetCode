package learning.数据结构基础.Day4;

import java.util.*;

/**
 * 435. 无重叠区间
 *
 * @author wenxingzhan
 * @date 2022/01/12 14:47
 **/
public class Question435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int b=intervals[0][1];
        int num = 0;
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0] < b) {
                num++;
            } else  {
                b = intervals[i][1];
            }

        }
        return num;
    }
}
