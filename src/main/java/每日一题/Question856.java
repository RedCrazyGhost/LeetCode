package 每日一题;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 856. 括号的分数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/09 09:30
 **/
public class Question856 {
    public int scoreOfParentheses(String s) {
        int len=s.length(),depth=0,value=0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i)=='('){
                depth+=1;
            }else{
                depth-=1;
                if (s.charAt(i-1)=='('){
                    value+=1<<depth;
                }
            }
        }
        return value;
    }
//  单调栈
//    public int scoreOfParentheses(String s) {
//        Deque<Integer> deque=new ArrayDeque<>();
//        deque.push(0);
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='('){
//                deque.push(0);
//            }else{
//                int v=deque.pop();
//                int top=deque.pop()+Math.max(2*v,1);
//                deque.push(top);
//            }
//        }
//        return deque.peek();
//    }
}
