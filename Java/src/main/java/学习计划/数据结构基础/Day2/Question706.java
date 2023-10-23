package 学习计划.数据结构基础.Day2;

import java.util.HashMap;
import java.util.Map;

/**
 * 706. 设计哈希映射
 *
 * @author wenxingzhan
 * @date 2022/01/11 19:35
 **/
public class Question706 {
//    脱离题意
    Map<Integer,Integer> map;
    public Question706() {
        map=new HashMap<>();
    }

    public void put(int key, int value) {
        map.put(key,value);
    }

    public int get(int key) {
        return map.get(key)==null?-1:map.get(key);
    }

    public void remove(int key) {
        map.remove(key);
    }
}
