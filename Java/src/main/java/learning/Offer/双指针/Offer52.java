package learning.Offer.双指针;

import 数据结构模型.ListNode;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 * 构造体创建ListNode 地址不同但val数值相同
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/31 14:40
 **/
public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
