package daily;

import java.util.Stack;

/**
 * 1614. 括号的最大嵌套深度
 *
 * @author wenxingzhan
 * @date 2021/11/15 20:56
 **/
public class Question1614 {
    public int maxDepth(String s) {
//        Stack<Character> stack=new Stack<>();
//        int depth=0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='('){
//                stack.push(s.charAt(i));
//            }
//            if (s.charAt(i)==')'){
//                stack.pop();
//            }
//            depth=Math.max(stack.size(),depth);
//        }
//        return depth;

//        优化
        int depth=0;
        int num=0;
        for(char c:s.toCharArray()){
            if (c=='('){
                num+=1;
                depth=Math.max(num,depth);
            }
            if (c==')'){
                num-=1;
            }
        }
        return depth;
    }
}
