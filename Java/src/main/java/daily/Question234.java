package daily;

import 数据结构模型.ListNode;

/**
 * 234. 回文链表
 *
 * @author wenxingzhan
 * @date 2021/11/16 08:08
 **/
public class Question234 {
//    public boolean isPalindrome(数据结构.ListNode head) {
//        List<Integer> list=new ArrayList<>();
//        while(head!=null){
//            list.add(head.val);
//            head=head.next;
//        }
//        System.out.println(list);
//        int left=0;
//        if (list.size()%2==0){
//            left= list.size()/2-1;
//        }else {
//            left = list.size() / 2;
//        }int right = list.size() / 2;
//            while(left>-1&&right<list.size()){
//                if (!list.get(left).equals(list.get(right))){
//                    return false;
//                }
//                left--;
//                right++;
//            }
//
//        return true;
//    }

    public boolean isPalindrome(ListNode head) {
        ListNode listnode0=null,index0=listnode0;
        ListNode listnode1=new ListNode(),index1=listnode1;

        while(head!=null){
            ListNode node0 = head;

            index1.next= new ListNode(head.val);
            index1=index1.next;


            head = head.next;
            node0.next = index0;
            index0 = node0;
        }
        listnode1= listnode1.next;
        while(index0!=null&&listnode1!=null){
            if (index0.val!=listnode1.val){
                return false;
            }
            index0=index0.next;
            listnode1=listnode1.next;
        }
        return true;
    }
}
