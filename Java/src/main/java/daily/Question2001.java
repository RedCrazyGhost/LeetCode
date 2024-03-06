package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 2001. 可互换矩形的组数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/17 17:41
 **/
public class Question2001 {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer> map=new HashMap<>();
        for(int[] arr:rectangles){
            map.put((double) (arr[0]/arr[1]),map.getOrDefault((double) (arr[0]/arr[1]),0)+1);
        }
        Long sum=0L;
        for(Integer i:map.values()){
            if (i!=1) {
                sum += (long) (i - 1) *(i-2)/2;
            }
        }
        return sum;
    }
}
