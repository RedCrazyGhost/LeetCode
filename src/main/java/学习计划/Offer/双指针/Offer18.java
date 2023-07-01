package 学习计划.Offer.双指针;

import 数据结构模型.ListNode;

/**
 * 剑指 Offer 18. 删除链表的节点
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/31 14:28
 **/
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode right=head,left=null;
        while(true){
            if (right.val==val){
                if (left==null){
                    return right.next;
                }else{
                    left.next=right.next;
                    return head;
                }
            }else{
                left=right;
                right=right.next;
            }
        }
    }
}
