package learning.数据结构基础.Day13;

import 数据结构模型.ListNode;

import java.util.*;

/**
 * 143. 重排链表
 *
 * @author wenxingzhan
 * @date 2022/01/14 20:29
 **/
public class Question143 {
    public void reorderList(ListNode head) {
       List<ListNode> list=new ArrayList<>();

        ListNode left=head,right=head;
        int num=0;
        while(right!=null&&right.next!=null){
            list.add(2*num++,left);
            left=left.next;
            right=right.next.next;
        }
        num=1;
        while(left!=null){
            list.add(num,left);
            num+=2;
            left=left.next;
        }
        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).next=list.get(i+1);
        }
        list.get(list.size()-1).next=null;
    }
}
