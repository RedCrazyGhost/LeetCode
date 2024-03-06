package daily;

import java.util.*;

/**
 * 1436. 旅行终点站
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/01 20:48
 **/
public class Question1436 {
    public String destCity(List<List<String>> paths) {
        Map<String,String>map=new HashMap<>();
        for(List<String> l:paths){
            map.put(l.get(0),l.get(1));
        }
        String point=paths.get(0).get(0);
        while(map.containsKey(point)){
            point=map.get(point);
        }
        return point;
    }
}
