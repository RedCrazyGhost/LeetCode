package daily;

import java.util.*;

/**
 * 387. 字符串中的第一个唯一字符
 *
 * @author wenxingzhan
 * @date 2021/11/03 20:28
 **/
public class Question387 {
    public int firstUniqChar(String s) {
        char[] chars=s.toCharArray();
        Map<Character, Integer> map=new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
           map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }

            for (int i = 0; i < chars.length; i++) {
                if(map.get(chars[i])==1){
                    return i;
                }
            }
            return -1;
    }
}
