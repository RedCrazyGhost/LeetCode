package learning.Offer.双指针;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/31 15:05
 **/
public class Offer58 {
    public String reverseWords(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
