package 学习计划.备战热身.Day1;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/3/29 15:14
 **/
public class Question20 {


    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
            }else{
                Character c = stack.peek();
                if( (c=='('&&chars[i]==')')||
                        (c=='['&&chars[i]==']')||
                        (c=='{'&&chars[i]=='}')){
                    stack.pop();
                }else{
                    stack.push(chars[i]);
                }
            }
        }


        if (stack.isEmpty()){
            return true;
        }else{
            return false;
        }


    }

}

