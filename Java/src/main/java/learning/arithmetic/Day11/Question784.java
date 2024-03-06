package learning.算法入门.Day11;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. 字母大小写全排列
 *
 * @author wenxingzhan
 * @date 2022/01/04 16:21
 **/
public class Question784 {
    List<String> list=new ArrayList<>();
    String s;
    public List<String> letterCasePermutation(String s) {
        this.s=s;
        dfs(0,new StringBuilder());
        return list;
    }
    public void dfs(int index,StringBuilder stringBuilder) {
        if (index == s.length()) {
            list.add(stringBuilder.toString());
        } else {
            char c = s.charAt(index);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                dfs(index + 1, new StringBuilder(stringBuilder.append(Character.toLowerCase(c))));
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                dfs(index + 1, new StringBuilder(stringBuilder.append(Character.toUpperCase(c))));
                } else {
                dfs(index + 1, new StringBuilder(stringBuilder.append(c)));
                }
            }
        }
    }
