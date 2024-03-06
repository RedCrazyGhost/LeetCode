package learning.Offer.链表;

import model.ListNode;

/**
 * 剑指 Offer 24. 反转链表
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/30 14:02
 **/
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode left=null,middle=head,right=head.next;
        while(true) {
            middle.next = left;
            left = middle;
            if (right != null) {
                middle = right;
            }else{
                return middle;
            }
            right=right.next;
        }
    }
}
