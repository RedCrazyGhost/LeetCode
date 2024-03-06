package daily;

import 数据结构模型.ListNode;

/**
 * 141. 环形链表
 *
 * @author wenxingzhan
 * @date 2021/11/04 15:57
 **/
public class Question141 {
    public boolean hasCycle(ListNode head) {
//        哈希表
//        Set<数据结构.ListNode> set=new HashSet<>();
//        while(head!=null){
//            if(!set.add(head)){
//                return false;
//            }
//            head=head.next;
//        }
//        return true;

//        快慢指针

        if (head!=null) {
            ListNode index0 = head, index1 = head;
            try {
                while(index1.next.next!=null){
                    index0= index0.next;
                    index1=index1.next.next;
                    if(index0== index1){
                        return true;
                    }
                }

            }catch (NullPointerException e){
                return false;
            }
        }
        return false;
    }
}
