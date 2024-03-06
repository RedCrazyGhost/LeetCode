package learning.Offer.查找算法;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/28 17:22
 **/
public class Offer50 {
    public char firstUniqChar(String s) {
        char[] chars=s.toCharArray();
        Map<Character,Boolean> map=new LinkedHashMap<>();
        for(char c:chars){
            map.put(c,!map.containsKey(c));
        }
        for (char c:chars){
            if (map.get(c)){
                return c;
            }
        }
        return ' ';
    }
}
