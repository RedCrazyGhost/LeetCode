package 学习计划.数据结构基础.Day12;

import 数据结构模型.ListNode;

/**
 * 24. 两两交换链表中的节点
 *
 * @author wenxingzhan
 * @date 2022/01/15 14:39
 **/
public class Question24 {
    public ListNode swapPairs(ListNode head) {
        ListNode left=head,node=head,index=null;
        int num=0;
        while(left!=null&&left.next!=null) {
            ListNode right=left.next;
            left.next = right.next;
            right.next = left;
            if (num++==0){
                node=right;
                index=node;
            }else{
                index.next.next=right;
                index=index.next.next;
            }
            left=left.next;


        }
        return node;
    }
}
