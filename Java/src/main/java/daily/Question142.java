package daily;

import model.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. 环形链表 II
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/30 15:46
 **/
public class Question142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while(head!=null){
            if (!set.add(head)){
                return head;
            }else{
                head=head.next;
            }
        }
        return null;
    }
    // 快慢指针 性能最佳
//    public ListNode detectCycle(ListNode head) {
//        ListNode fast=head,slow=head;
//        do {
//            if (fast == null || fast.next == null) {
//                return null;
//            }
//            fast = fast.next.next;
//            slow = slow.next;
//        } while (fast != slow);
//        fast=head;
//        while(slow!=fast){
//            slow=slow.next;
//            fast=fast.next;
//        }
//        return fast;
//    }
}
