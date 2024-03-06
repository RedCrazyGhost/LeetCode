package daily;

import 数据结构模型.ListNode;

import java.util.*;

/**
 * 817. 链表组件
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/12 12:02
 **/
public class Question817 {
    public int numComponents(ListNode head, int[] nums) {
        int num=0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        while(head!=null){
            if (set.contains(head.val)){
                while(head!=null&& set.contains(head.val)){
                    head=head.next;
                }
                num+=1;
            }else {
                head = head.next;
            }
        }
        return num;
    }
}
