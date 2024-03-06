package learning.Offer.栈与队列;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/01 14:58
 **/
public class Offer9 {
    Stack<Integer> stack0;
    Stack<Integer> stack1;

    public Offer9() {
        stack0=new Stack<>();
        stack1=new Stack<>();
    }

    public void appendTail(int value) {
        stack0.add(value);
    }

    public int deleteHead() {
       if (stack1.isEmpty()) {
           if (stack0.isEmpty()){
               return -1;
           }else{
               while(!stack0.isEmpty()){
                   stack1.add(stack0.pop());
               }
               return stack1.pop();
           }
       }else{
           return stack1.pop();
       }
    }
}
