package model;

/**
 * Definition for a Node.
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/30 14:24
 **/
public class RandomListNode {
    public int val;
    public RandomListNode next;
    public RandomListNode random;

    public RandomListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
