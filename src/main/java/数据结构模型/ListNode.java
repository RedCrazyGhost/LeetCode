package 数据结构模型;

public class ListNode {
      public int val;
     public ListNode next;
    public ListNode(){}
     public ListNode(int x) { val = x; }
    public ListNode(int x,ListNode listNode) { val = x; next=listNode;}

    /**
     * 数组快速生成单向链表
     * @param arr
     */
    public ListNode(int[] arr){
        int len = arr.length;
        val = arr[0];
        ListNode nextNode = null;
        for (int i = 1; i < len; i++) {
            ListNode node = new ListNode(arr[i]);
            if (next == null) {
                next = node;
            } else {
                nextNode.next = node;
            }
            nextNode = node;
        }
    }

    public String toValueString(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append('[').append(val).append(' ');
        ListNode node=next;
        while(node!=null){
            stringBuilder.append(node.val).append(' ');
            node=node.next;
        }
        stringBuilder.setCharAt(stringBuilder.length()-1,']');
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "ListNode{ val = " + val +", next = " + next + '}';
    }
}
