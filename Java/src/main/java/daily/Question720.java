package daily;

import model.Trie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 720. 词典中最长的单词
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/17 16:22
 **/
public class Question720 {
    public String longestWord(String[] words) {
        Arrays.sort(words);

        Set<String> set = new HashSet<>();
        String str = "";
        for (String s : words) {
            //s.length() == 1 保留开头字母
            if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
//                获取长度最大的单词 并且 达到字典序最小
                str = s.length() > str.length() ? s : str;
                set.add(s);
            }
        }
        return str;

    }
}
