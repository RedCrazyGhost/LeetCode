package daily;

import 数据结构模型.ListNode;

/**
 * 21. 合并两个有序链表
 *
 * @author wenxingzhan
 * @date 2021/11/06 11:15
 **/
public class Question21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode index1=l1,index2=l2;
        ListNode l3=new ListNode(),index3=l3;

        while(index1!=null&&index2!=null){
            ListNode o;
            if (index1.val<=index2.val){
                o=index1;
                index1=index1.next;
                o.next=null;
            }else{
                o=index2;
                index2=index2.next;
                o.next=null;
            }
            index3.next=o;
            index3=index3.next;
        }
        if (index1==null){
            index3.next=index2;
        }else{
            index3.next=index1;
        }
        return l3.next;
    }
}
