package 学习计划.数据结构基础.Day7;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. 单词规律
 *
 * @author wenxingzhan
 * @date 2022/01/12 20:28
 **/
public class Question290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        String[] strs=s.split(" ");
        if (strs.length==pattern.length()) {
            for (int i = 0; i < pattern.length(); i++) {
                String str = map.getOrDefault(pattern.charAt(i), "");
                if (str.equals("") && !map.containsValue(strs[i])) {
                    map.put(pattern.charAt(i), strs[i]);
                } else {
                    if (!str.equals(strs[i])) {
                        return false;
                    }
                }
            }
            return true;
        }return false;
    }
}
