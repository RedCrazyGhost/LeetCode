package 每日一题;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1106. 解析布尔表达式
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/11/05 13:32
 **/
public class Question1106 {
    public boolean parseBoolExpr(String expression) {
        Deque<Character> stack=new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c==','){
                continue;
            }else if (c!=')'){
                stack.push(c);
            }else{
                int t=0,f=0;
                while(stack.peek()!='('){
                    char value= stack.pop();
                    if (value=='t'){
                        t+=1;
                    }else {
                        f+=1;
                    }
                }
                stack.pop();
                char op= stack.pop();
                switch (op){
                    case '!'->{ stack.push(f==1?'t':'f');}
                    case '&'->{ stack.push(f==0?'t':'f');}
                    case '|'->{ stack.push(t>0?'t':'f');}
                    default -> {}
                }
            }
        }
        return stack.pop()=='t';
    }
}
