package 学习计划.备战热身.Day1;

import java.util.Stack;

public class Question20 {


    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    //
    //有效字符串需满足：
    //
    //左括号必须用相同类型的右括号闭合。
    //左括号必须以正确的顺序闭合。
    //每个右括号都有一个对应的相同类型的左括号。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode.cn/problems/valid-parentheses
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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

