package top100;

import java.util.Stack;

/**
 * 20. 有效的括号
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/01/08 17:27
 * @思考 使用Stack先进后出的特点，可以完成对括号匹配顺序的检测。
 **/
public class Question20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            switch (c) {
                case '(', '[', '{' -> stack.add(c);
                case ')'-> {if (!stack.empty()&&stack.peek()=='('){stack.pop();}else{return false;}}
                case ']'-> {if (!stack.empty()&&stack.peek()=='['){stack.pop();}else{return false;}}
                case '}'-> {if (!stack.empty()&&stack.peek()=='{'){stack.pop();}else{return false;}}
            }
        }
        return stack.empty();
    }
}
