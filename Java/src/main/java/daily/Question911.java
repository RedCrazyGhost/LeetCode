package daily;

import java.util.*;

/**
 * 911. 在线选举
 * 超时！
 * @author wenxingzhan
 * @date 2021/12/11 11:38
 **/
public class Question911 {
    int[] timeline;
    public Question911(int[] persons, int[] times) {
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> target=new HashMap<>();
        timeline=new int[times[times.length-1]+1];
        int up=-1;
        for (int i = 0; i <times.length; i++) {
            map.put(persons[i],map.getOrDefault(persons[i],0)+1);
            List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
            list.sort((Comparator.comparingInt(Map.Entry::getValue)));
            int max=list.get(list.size()-1).getValue();
            List<Integer> keys=new ArrayList<>();
            for (int j = list.size()-1; j > -1; j--) {
                if (list.get(j).getValue()!=max){
                    break;
                }
                keys.add(list.get(j).getKey());
            }
            int index=0;
            if (i== times.length-1){
                 index=times[i];
            }else{
                index=times[i+1];

            }
            if (keys.size()==1){
                set(times[i],index,keys.get(0));
                up=keys.get(0);
            }else {
                if(keys.contains(persons[i])) {
                    set(times[i], index, persons[i]);
                    up= persons[i];
                }else{
                    set(times[i], index, up);
                }
            }
        }
    }

    public int q(int t) {
        if (t>=timeline.length){
            return timeline[timeline.length-1];
        }
        return timeline[t];
    }
    public void  set(int indexl,int indexr,int person){
        for (int i = indexl; i <=indexr ; i++) {
            timeline[i]=person;
        }
    }
}
