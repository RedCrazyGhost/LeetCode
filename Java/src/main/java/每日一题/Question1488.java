package 每日一题;

import java.util.*;

/**
 * 1488. 避免洪水泛滥
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/10/13 12:45
 **/
public class Question1488 {

    public int[] avoidFlood(int[] rains) {
        int[] options=new int[rains.length];
        Arrays.fill(options,1);
        TreeSet<Integer> set=new TreeSet<>();
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i]==0){
                set.add(i);
            }else{
                options[i]=-1;
                if (map.containsKey(rains[i])){
                    Integer j = set.ceiling(map.get(rains[i]));
                    if (j==null) return new int[0];
                    options[j]=rains[i];
                    set.remove(j);
                }
                map.put(rains[i], i);
            }
        }
        return options;
    }


//    超时 （可能存在逻辑问题）
//    public int[] avoidFlood(int[] rains) {
//        Map<Integer,Integer> lakeMap=new HashMap<>();
//        int[] options=new int[rains.length];
//
//        for (int i = 0; i < rains.length; i++) {
//            if (rains[i] > 0){
//                if(lakeMap.getOrDefault(rains[i], 0)==0){
//                    lakeMap.put(rains[i],1);
//                    options[i]=-1;
//                }else{
//                    return new int[0];
//                }
//            }else if (rains[i] == 0){
//                boolean isFlag=false;
//                for (int j = i+1; j < rains.length&&!isFlag; j++) {
//                    if (rains[j]>0&&lakeMap.getOrDefault(rains[j], 0)==1){
//                        lakeMap.put(rains[j],0 );
//                        options[i]=rains[j];
//                        isFlag=true;
//                    }
//                }
//                if (!isFlag) options[i]=1;
//            }
//        }
//        return options;
//    }
}
