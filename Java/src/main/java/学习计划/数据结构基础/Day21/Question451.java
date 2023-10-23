package 学习计划.数据结构基础.Day21;

import java.util.*;

/**
 * 451. 根据字符出现频率排序
 *
 * @author wenxingzhan
 * @date 2022/01/25 21:13
 **/
public class Question451 {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (char c :s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> list=new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        StringBuilder stringBuilder=new StringBuilder();
        for (Map.Entry<Character, Integer> characterIntegerEntry : list) {
            char c = characterIntegerEntry.getKey();
            stringBuilder.append(String.valueOf(c).repeat(Math.max(0, characterIntegerEntry.getValue())));
        }
        return stringBuilder.toString();
    }
}
