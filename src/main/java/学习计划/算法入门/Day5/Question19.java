package 学习计划.算法入门.Day5;

import 数据结构模型.ListNode;

/**
 * 19. 删除链表的倒数第 N 个结点
 *
 * @author wenxingzhan
 * @date 2021/12/31 14:04
 **/
public class Question19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode lsnum = head;
        ListNode option = head;
        int num = 1;
        while (lsnum.next != null) {
            num += 1;
            lsnum = lsnum.next;
        }

        if((num -= n) !=0) {
            for (int i = 1; i < num; i++) {
                option = option.next;
            }
            if (option.next.next != null) {
                option.next = option.next.next;
            } else {
                option.next = null;
            }
        }else{
            return head.next;
        }
        return head;
    }
}
