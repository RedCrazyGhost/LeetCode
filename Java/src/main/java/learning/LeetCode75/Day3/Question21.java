package learning.LeetCode75.Day3;

import model.ListNode;

/**
 * 21. 合并两个有序链表
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/29 12:36
 **/
public class Question21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null&&list2==null){
            return null;
        } else if (list1 == null) {
            return list2;
        }else if (list2 == null){
            return list1;
        }
        ListNode head=new ListNode(),index=head;
        ListNode index1=list1,index2=list2;
        while(index1!=null&&index2!=null) {
            if(index1.val<=index2.val){
                index.next=index1;
                index1=index1.next;
            }else{
                index.next=index2;
                index2=index2.next;
            }
            index=index.next;
            index.next=null;
        }
        if (index1==null){
            index.next=index2;
        }
        if (index2==null){
            index.next=index1;
        }
        return head.next;
    }
}
