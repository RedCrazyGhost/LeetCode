package learning.LeetCode75.Day15;

import java.util.*;

/**
 * 692. 前K个高频单词
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/10 12:34
 **/
public class Question692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for (String s : words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> list=new ArrayList<>(map.keySet());
        list.sort((word1, word2) -> Objects.equals(map.get(word1), map.get(word2)) ? word1.compareTo(word2) : map.get(word2) - map.get(word1));
        return list.subList(0,k);
    }
}
