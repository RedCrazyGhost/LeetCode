package learning.数据结构基础.Day11;

import 数据结构模型.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 160. 相交链表
 *
 * @author wenxingzhan
 * @date 2022/01/08 16:41
 **/
public class Question160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set=new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(!set.add(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
