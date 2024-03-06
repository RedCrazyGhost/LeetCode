package learning.数据结构基础.Day10;

import 数据结构模型.ListNode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 142. 环形链表 II
 *
 * @author wenxingzhan
 * @date 2022/01/14 17:06
 **/
public class Question142 {
    public ListNode detectCycle(ListNode head) {
//        HashSet
//        Set<ListNode> set=new HashSet<>();
//        while(head!=null){
//            if(set.add(head)){
//                head=head.next;
//            }else{
//                return head;
//            }
//        }
//        return null;

//    快慢指针
        if (head==null){
            return null;
        }
        ListNode left=head,right=head;
        while(left!=null){
            left=left.next;
            if (right.next!=null){
                right=right.next.next;
            }else{
                return null;
            }
            if (left==right){
                ListNode index=head;
                while(index!=left){
                    left=left.next;
                    index=index.next;
                }
                return index;
            }

        }
        return null;
    }
}
