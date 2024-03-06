package daily;

import model.ListNode;

/**
 * 2181. 合并零之间的节点
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/23 21:02
 **/
public class Question2181 {
    public ListNode mergeNodes(ListNode head) {
//        ListNode root=new ListNode(),index=root;
//        int sum=0;
//        while(head!=null){
//            if (head.val==0){
//                index.next=new ListNode(sum);
//                index=index.next;
//                sum=0;
//            }else{
//                sum+= head.val;
//            }
//
//            head=head.next;
//        }
//        return root.next.next;

        ListNode left=head,right=head.next;
        while(right!=null){
            if (right.val==0&&right.next!=null){
                left=left.next;
                left.val=0;
            }else{
                left.val+= right.val;
            }
            right=right.next;
        }
        left.next=null;
        return head;
    }
}
