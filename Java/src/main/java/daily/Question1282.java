package daily;

import java.util.*;

/**
 * 1282. 用户分组
 * 可优化
 * @author wenxingzhan
 * @date 2021/12/19 23:20
 **/
public class Question1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list=new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> list0=map.getOrDefault(groupSizes[i],new ArrayList<>());
            list0.add(i);
            map.put(groupSizes[i],list0);
        }

        for(Map.Entry entry:map.entrySet()){
           Integer groupsize= (Integer) entry.getKey();
           ArrayList list0= (ArrayList) entry.getValue();
           int num=list0.size()%groupsize==0?list0.size()/groupsize:list0.size()/groupsize+1;
            for (int i = 0; i < num; i++) {
               list.add(list0.subList(groupsize*i,groupsize*i+groupsize>list0.size()?list0.size():groupsize*i+groupsize));
            }
        }

        return list;
    }
}
