package learning.Offer.模拟;

import java.util.Stack;

/**
 * 剑指 Offer 31. 栈的压入、弹出序列
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/12 18:23
 **/
public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(int num:pushed){
            stack.push(num);
            while(!stack.isEmpty()&& stack.peek()==popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
