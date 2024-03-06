package learning.数据结构基础.Day11;

import model.ListNode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 82. 删除排序链表中的重复元素 II
 *
 * @author wenxingzhan
 * @date 2022/01/14 20:00
 **/
public class Question82 {
    public ListNode deleteDuplicates(ListNode head) {
//        HashMap
//        Map<Integer,Integer> map=new LinkedHashMap<>();
//        while(head!=null){
//            map.put(head.val,map.getOrDefault(head.val,0)+1);
//            head=head.next;
//        }
//        ListNode listNode=new ListNode(),index=listNode;
//        for(Map.Entry<Integer,Integer> e: map.entrySet()){
//            if (e.getValue().equals(1)){
//                index.next=new ListNode(e.getKey());
//                index=index.next;
//            }
//        }
//        return listNode.next;

        if (head==null){
            return null;
        }

        ListNode listNode=new ListNode(0,head),index=listNode;

        while (index.next!=null&&index.next.next!=null){
            if (index.next.val==index.next.next.val){
                int num=index.next.val;
                while(index.next!=null&&num==index.next.val){
                    index.next=index.next.next;
                }
            }else{
                index=index.next;
            }
        }
        return listNode.next;
    }
}
