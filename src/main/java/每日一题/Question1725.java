package 每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * 1725. 可以形成最大正方形的矩形数目
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/27 17:41
 **/
public class Question1725 {
    public int countGoodRectangles(int[][] rectangles) {
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int[] arr:rectangles){
//            int min=Math.min(arr[0],arr[1]);
//            map.put(min,map.getOrDefault(min,0)+1);
//        }
//        int maxkey=0,maxvalue=0;
//        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//            if (maxkey<entry.getKey()){
//                maxkey=entry.getKey();
//                maxvalue= entry.getValue();
//            }
//        }
//        return maxvalue;
        int num=0,key=0;
        for(int[] arr:rectangles){
            int size=Math.min(arr[0],arr[1]);
            if (size>key){
                key=size;
                num=1;
            }else if (size==key){
                num+=1;
            }
        }
        return num;
    }
}
