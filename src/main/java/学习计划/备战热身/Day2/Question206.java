package 学习计划.备战热身.Day2;

import 数据结构模型.ListNode;

public class Question206 {

    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }

        ListNode index=head,middle=null,left=null;
        while(index!=null){
            if (left!=null){
                middle=index;
                index=index.next;
                middle.next=left;
                left=middle;
            }else{
                left=index;
                index=index.next;
                left.next=null;
            }
        }

        return middle;
    }
}
