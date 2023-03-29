package top100;

import 数据结构模型.ListNode;

/**
 * 21. 合并两个有序链表
 *
 * 排除双链表为空和单链表为空的情况，双链表排序会出现某一链表提前走完，后续链表直接拼接上即可。
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/01/08 18:11
 **/
public class Question21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null&&list2==null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode index1=list1,index2=list2;
        ListNode result=new ListNode(),index=result;

        while(index1!=null&&index2!=null){
            if(index1.val<= index2.val){
                index.next=new ListNode(index1.val);
                index1=index1.next;
            }else{
                index.next=new ListNode(index2.val);
                index2=index2.next;
            }
            index=index.next;
            if (index1==null){
                index.next=index2;
            }
            if (index2==null){
                index.next=index1;
            }
        }

        return result.next;
    }
}
