package daily;

import java.util.Stack;

/**
 * 921. 使括号有效的最少添加
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/04 12:05
 **/
public class Question921 {
    public int minAddToMakeValid(String s) {
        int left=0,right=0;
        for(char c:s.toCharArray()){
            if (left>0&&c==')'){
                left-=1;
                continue;
            }
            if (c=='('){
                left+=1;
            }else{
                right+=1;
            }
        }
        return left+right;
    }

//    性能差
//    public int minAddToMakeValid(String s) {
//        Stack<Character> stack=new Stack<>();
//        for(char c:s.toCharArray()){
//            if (!stack.isEmpty()&&stack.peek()=='('&&c==')'){
//                stack.pop();
//                continue;
//            }
//            stack.add(c);
//        }
//        return stack.size();
//    }
}
