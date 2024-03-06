package daily;

import model.ListNode;

/**
 * 86. 分隔链表
 *
 * @author wenxingzhan
 * @date 2021/11/05 17:00
 **/
public class Question86 {
    public ListNode partition(ListNode head, int x) {
        ListNode listmin=new ListNode(),minindex=listmin;
        ListNode listmax=new ListNode(),maxindex=listmax;
        while(head!=null) {
            ListNode o = head;
            head = head.next;
            o.next = null;
            if (o.val < x) {
                listmin.next = o;
                listmin = listmin.next;
            } else {
                listmax.next = o;
                listmax = listmax.next;
            }
        }
        if (minindex.next !=null) {
            minindex = minindex.next;
            maxindex = maxindex.next;
            listmin.next = maxindex;
            return minindex;
        }else {
            return maxindex.next;
        }
    }
}
