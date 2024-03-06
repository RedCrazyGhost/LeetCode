package learning.Offer.双指针;

import 数据结构模型.ListNode;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/31 14:22
 **/
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode right=head;
        for (int i = 0; i < k; i++) {
            right=right.next;
        }
        ListNode left=head;
        while(right!=null){
            left=left.next;
            right=right.next;
        }
        return left;
    }

}
