package learning.LeetCode75.Day3;

import 数据结构模型.ListNode;

/**
 * 206. 反转链表
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/29 12:51
 **/

public class Question206 {
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode index=head,middle=null,left=null;
        while(index!=null){
            if (middle==null){
                middle=index;
                index= index.next;
                middle.next=null;
            }else{
                left=index;
                index=index.next;
                left.next=middle;
                middle=left;
            }
        }
        return middle;
    }
}
