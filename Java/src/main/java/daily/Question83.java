package daily;

import model.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 *
 * @author wenxingzhan
 * @date 2021/11/04 15:28
 **/
public class Question83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ihead=null,index=head,iindex=null;
        if (index!=null){
            ihead=new ListNode(index.val);
            iindex=ihead;
            while(index!=null){
                if (iindex.val<index.val){
                    iindex.next=new ListNode(index.val);
                    iindex=iindex.next;
                }
                index=index.next;
            }
            return ihead;
        }else{
            return null;
        }
    }
}
