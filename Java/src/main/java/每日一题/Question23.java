package 每日一题;

import 数据结构模型.ListNode;

/**
 * 23. 合并 K 个升序链表
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/12 17:16
 **/
public class Question23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) return null;
        if (lists.length==1) return lists[0];
        ListNode head=new ListNode(),node=head;

        while(true) {
            // 找到目标node
            int targetIndex = -1;
            int targetNum = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i]!=null&&lists[i].val < targetNum) {
                    targetIndex = i;
                    targetNum=lists[i].val;
                }
            }
            if (targetIndex==-1){
                break;
            }

            // 拼接交换
            node.next = lists[targetIndex];
            lists[targetIndex] = lists[targetIndex].next;
            node = node.next;
            node.next = null;
        }
        return head.next;
    }
}
