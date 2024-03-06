package learning.Offer.链表;

import 数据结构模型.RandomListNode;

/**
 * 剑指 Offer 35. 复杂链表的复制
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/30 14:18
 **/
public class Offer35 {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head==null){
            return null;
        }
        for(RandomListNode node =head,copy=null;node!=null;node=node.next.next){
            copy=new RandomListNode(node.val);
            copy.next=node.next;
            node.next=copy;
        }
        for (RandomListNode node =head;node!=null;node=node.next.next){
            if (node.random!=null){
                node.next.random=node.random.next;
            }
        }
        RandomListNode newHead=head.next;
        for (RandomListNode node = head, temp = null; node.next != null;){
            temp=node.next;
            node.next=temp.next;
            node=temp;
        }
        return newHead;
    }
}
