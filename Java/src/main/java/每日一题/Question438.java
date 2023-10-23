package 每日一题;

import java.util.*;

/**
 * 438. 找到字符串中所有字母异位词
 *
 * @author wenxingzhan
 * @date 2021/11/28 13:16
 **/
public class Question438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (p.length() <= s.length()) {
            Map<Character, Integer> map = new HashMap<>();

            for (char c : p.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }


            for (int i = 0; i <= s.length() - p.length(); i++) {
                Map<Character, Integer> map1 = new HashMap<>();
               for (int j = 0; j < p.length(); j++) {
                    if (map.containsKey(s.substring(i, i + p.length()).charAt(j))) {
                        map1.put(s.substring(i, i + p.length()).charAt(j), map1.getOrDefault(
                                s.substring(i, i + p.length()).charAt(j), 0) + 1);
                    }else{
                        break;
                    }
                }
               if (map.equals(map1)) {
                   list.add(i);
               }
            }
        }
        return list;
    }
}
