package daily;

import model.ListNode;

/**
 * 面试题 02.03. 删除中间节点
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/07 20:14
 **/
public class QuestionInterview0203 {
    public void deleteNode(ListNode node) {

        while(node.next!=null){
            node.val=node.next.val;
            if(node.next.next!=null) {
                node = node.next;
            }else{
                node.next=null;
            }
        }
    }
}
