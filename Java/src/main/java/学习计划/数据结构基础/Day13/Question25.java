package 学习计划.数据结构基础.Day13;

import 数据结构模型.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 25. K 个一组翻转链表
 *
 * @author wenxingzhan
 * @date 2022/01/15 15:43
 **/
public class Question25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<ListNode> list=new ArrayList<>();

        ListNode index=head;
        while(index !=null){
            ListNode node=index;
            index=index.next;
            node.next=null;
            list.add(node);
        }

        ListNode head0=new ListNode(),index0=head0;

        for (int i = 0; i < list.size()/k; i++) {
            for (int j = (i+1)*k-1; j >k*i-1 ; j--) {
                index0.next=list.get(j);
                index0=index0.next;
            }
        }
        for (int i =list.size()/k*k ; i < list.size(); i++) {
            index0.next=list.get(i);
            index0=index0.next;
        }

        

        return head0.next;

    }
}
