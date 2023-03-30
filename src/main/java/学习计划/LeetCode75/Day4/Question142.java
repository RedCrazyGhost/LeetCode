package 学习计划.LeetCode75.Day4;

import 数据结构模型.ListNode;

/**
 * 142. 环形链表 II
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/30 13:56
 **/
public class Question142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        do {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);
        fast=head;
        while(slow!=fast){
            fast= fast.next;
            slow= slow.next;
        }
        return fast;
    }
}
