package 每日一题;

import 数据结构模型.ListNode;

/**
 * 1290. 二进制链表转整数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/02 20:29
 **/
public class Question1290 {
    public int getDecimalValue(ListNode head) {
        int num=0;
        while(head!=null){
            num<<=1;
           if( head.val==1){
               num+=1;
           }
           head=head.next;
        }
        return num;
    }
}
