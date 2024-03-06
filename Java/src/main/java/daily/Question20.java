package daily;

import java.util.Queue;
import java.util.Stack;

/**
 * 20. 有效的括号
 *
 * @author wenxingzhan
 * @date 2021/11/08 11:02
 **/
public class Question20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '[':
                    case '{':
                    case '(':
                        stack.push(s.charAt(i));
                        break;
                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                }
            }
            if (stack.isEmpty()){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }
}
