package learning.算法入门.Day10;

import 数据结构模型.ListNode;

/**
 * 206. 反转链表
 *
 * @author wenxingzhan
 * @date 2021/11/04 16:39
 **/
public class Question206 {
    public ListNode reverseList(ListNode head) {
//        数据结构.ListNode a=head,b=head;
//        List<Integer> list=new ArrayList<>();
//        while(head!=null){
//            list.add(head.val);
//            head=head.next;
//        }
//        for (int i = list.size()-1; i >-1; i--) {
//            a.val=list.get(i);
//            a=a.next;
//        }
//        return b;

//        链表 从头到尾 相当于逆序
        ListNode index=null,index1=null,listNode = new ListNode();
        while(head!=null){
            index=head;
            head=head.next;
            listNode.next=index;
            index.next=index1;
            index1=index;
        }
        return listNode.next;
    }
}
