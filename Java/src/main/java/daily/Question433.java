package daily;

import java.util.*;

/**
 * 433. 最小基因变化
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/07 09:41
 **/
public class Question433 {
//    LeetCode 官方解法
    public int minMutation(String start, String end, String[] bank) {
        Set<Integer> target=null;
        Map<Set<Integer>,Integer> map=new HashMap<>();
        for (int i = 0; i < bank.length; i++) {
            Set<Integer> set=new HashSet<>();
            for (int j = 0; j < 8; j++) {
                if (start.charAt(j)!=bank[i].charAt(j)){
                    set.add(j);
                }
            }
            map.put(set,i);
            if (end.equals(bank[i])){
                target=set;
            }
        }

        int min=0;
        if (target != null){
            for(Map.Entry<Set<Integer>,Integer> entry:map.entrySet()){

                if (target.containsAll(entry.getKey())){
                    min+=1;
                }
            }
        }

        if (min==0||min!=target.size()){
            return -1;
        }else{
            return min;
        }

    }
}
