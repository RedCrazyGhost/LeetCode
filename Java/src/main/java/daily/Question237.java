package daily;

import 数据结构模型.ListNode;

public class Question237 {
    public void deleteNode(ListNode node) {
        System.out.println(node.toString());
        while (node.next != null) {
            node.val = node.next.val;
            if(node.next.next==null) {
                node.next=null;
            }else{
                node = node.next;
            }
        }
    }
}
