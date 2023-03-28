package 每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * 677. 键值映射
 *
 * @author wenxingzhan
 * @date 2021/11/14 11:12
 **/
public class Question677 {
    Map<String,Integer> map;
    int num;
    public Question677() {
        map=new HashMap<>();
        num=0;
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        num=0;
        for(String str:map.keySet()){
            if (str.startsWith(prefix)){
                num+=map.get(str);
            }
        }
        return num;
    }
}
