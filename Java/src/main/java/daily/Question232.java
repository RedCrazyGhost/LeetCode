package daily;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 *
 * @author wenxingzhan
 * @date 2021/11/10 12:45
 **/
public class Question232 {

    Stack<Integer> stack0;
    Stack<Integer> stack1;

    int font;

    public Question232() {
        stack0=new Stack<>();
        stack1=new Stack<>();
    }

    public void push(int x) {
        if (stack0.isEmpty()){
            font=x;
        }
        stack0.push(x);
    }

    public int pop() {
        if (stack1.isEmpty()) {
            while (stack0.size() != 0) {
                stack1.push(stack0.pop());
            }
        }
        return  stack1.pop();
    }

    public int peek() {
       if (!stack1.isEmpty()){
           return stack1.peek();
       }
       return font;
    }

    public boolean empty() {
       return stack1.isEmpty() && stack0.isEmpty();
    }
}

