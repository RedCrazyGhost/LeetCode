package learning.Offer.双指针;

import 数据结构模型.ListNode;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/31 14:03
 **/
public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode head=new ListNode(),index=head;
      while(l1!=null&&l2!=null){
          if (l1.val<=l2.val){
              index.next=l1;
              l1=l1.next;
          }else{
              index.next=l2;
              l2=l2.next;
          }
          index=index.next;
      }
      if (l1==null){
          index.next=l2;
      }
      if (l2==null){
          index.next=l1;
      }
      return head.next;
    }
}
