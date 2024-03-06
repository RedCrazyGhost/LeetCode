package daily;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1331. 数组序号转换
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/07/28 11:39
 **/
public class Question1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr0=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr0);
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr0){
            if (!map.containsKey(i)){
                map.put(i,map.size()+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}
