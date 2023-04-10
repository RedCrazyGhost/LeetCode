package 学习计划.LeetCode75.Day14;

import java.util.Stack;

/**
 * 844. 比较含退格的字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/09 12:11
 **/
public class Question844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S1=new Stack<>();
        Stack<Character> T1=new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='#'){
                if (!S1.isEmpty()) {
                    S1.pop();
                }
            }else{
                S1.push(c);
            }
        }
        for (char c : t.toCharArray()) {
            if (c=='#'){
                if (!T1.isEmpty()) {
                    T1.pop();
                }
            }else{
                T1.push(c);
            }
        }
        return S1.toString().equals(T1.toString());
    }
}
