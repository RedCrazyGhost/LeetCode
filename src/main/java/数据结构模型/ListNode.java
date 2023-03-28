package 数据结构模型;

public class ListNode {
      public int val;
     public ListNode next;
    public ListNode(){}
     public ListNode(int x) { val = x; }
    public ListNode(int x,ListNode listNode) { val = x; next=listNode;}

    @Override
    public String toString() {
        return "数据结构.ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
