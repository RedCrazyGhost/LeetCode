package 学习计划.Offer.栈与队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer 30. 包含min函数的栈
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/01 15:19
 **/
public class Offer30 {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public Offer30() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

}
