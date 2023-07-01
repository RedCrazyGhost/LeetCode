package 学习计划.Offer.链表;

import 数据结构模型.ListNode;

import java.util.Stack;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/30 13:45
 **/
public class Offer6 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        while(head!=null){
            stack.add(head.val);
            head=head.next;
        }
        int[] arr=new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }
        return arr;
    }
}
