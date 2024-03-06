package learning.算法入门.Day5;

import model.ListNode;

/**
 * 876. 链表的中间结点
 *
 * @author wenxingzhan
 * @date 2021/12/31 13:41
 **/
public class Question876 {
    public ListNode middleNode(ListNode head) {
        ListNode indexleft=head;
        ListNode indexright=head;

        while(indexright.next!=null&&indexright.next.next!=null){
            indexleft=indexleft.next;
            indexright=indexright.next.next;
        }
        if (indexright.next!=null){
            indexleft=indexleft.next;
        }
        return indexleft;
    }
}
