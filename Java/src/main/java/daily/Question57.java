package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. 插入区间
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/28 16:31
 **/
public class Question57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        int len=intervals.length;
        int i=0;
        for (;i<len&&newInterval[0]>intervals[i][1];i++) list.add(intervals[i]);
        for(; i<len&&newInterval[1]>=intervals[i][0];i++){
           newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
           newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
        }
        list.add(newInterval);
        for (;i<len;i++) list.add(intervals[i]);
        return list.toArray(new int[list.size()][2]);
    }
}
