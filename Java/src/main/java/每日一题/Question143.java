package 每日一题;

import 数据结构模型.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 143. 重排链表
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/31 18:30
 **/
public class Question143 {
    public void reorderList(ListNode head) {
        List<ListNode> list=new LinkedList<>();
        ListNode index=head;
        while(index!=null){
            ListNode node=index;
            index=index.next;
            node.next=null;
            list.add(node);
        }
        index=head;
        for (int i = 0; i < list.size(); i++) {
            int idx=i/2;
            if (i%2==1) idx=list.size()-1-idx;
            index.next=list.get(idx);
            index=index.next;
        }
    }
}
