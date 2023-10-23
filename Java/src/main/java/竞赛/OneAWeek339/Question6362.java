package 竞赛.OneAWeek339;

import java.util.Stack;

/**
 * 6362. 最长平衡子字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/02 10:31
 **/
public class Question6362 {
    public int findTheLongestBalancedSubstring(String s) {
        char[] chars = s.toCharArray();
        int len= chars.length;
        int num=0,middle=0;
        boolean isOpen=false;
        Stack<Character> stack=new Stack<>();
        for (char aChar : chars) {
            if (aChar == '0') {
                if (isOpen) {
                    num = Math.max(num, middle);
                    stack.clear();
                    isOpen=false;
                }
                middle = 0;
                stack.push('0');
            } else {
                if (!stack.isEmpty()) {
                    isOpen=true;
                    stack.pop();
                    middle += 2;
                }
            }
        }
        num = Math.max(num, middle);
        return num;
    }
}
