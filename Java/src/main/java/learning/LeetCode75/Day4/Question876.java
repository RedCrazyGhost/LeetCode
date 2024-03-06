package learning.LeetCode75.Day4;

import model.ListNode;

/**
 * 876. 链表的中间结点
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/30 12:56
 **/
public class Question876 {
    public ListNode middleNode(ListNode head) {
        ListNode left=head,right=head;
        int step=0;
        while(right!=null){
            right=right.next;
            if (step==1){
                left=left.next;
                step=0;
            }else{
                step+=1;
            }
        }
        return left;
    }

}
