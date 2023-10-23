package 每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * 1791. 找出星型图的中心节点
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/25 17:24
 **/
public class Question1791 {
    public int findCenter(int[][] edges) {
//        int[] arr=new int[edges.length+2];
//        int index=0;
//        for (int i = 0; i <edges.length ; i++) {
//            arr[edges[i][0]]++;
//            arr[edges[i][1]]++;
//            if(arr[edges[i][0]]>arr[edges[i][1]]){
//                index=edges[i][0];
//            }else{
//                index=edges[i][1];
//            }
//        }
//        return index;

//        Map<Integer,Integer> map=new HashMap<>();
//        for(int[] arr:edges){
//            map.put(arr[0],map.getOrDefault(arr[0],0)+1);
//            map.put(arr[1],map.getOrDefault(arr[1],0)+1);
//        }
//        int key=0,value=0;
//        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
//            if (value<entry.getValue()){
//                key= entry.getKey();
//                value=entry.getValue();
//            }
//        }
//        return key;
        return edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1]?edges[0][0]:edges[0][1];
    }
}
