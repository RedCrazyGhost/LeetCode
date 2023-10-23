package 学习计划.Offer.栈与队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer 59 - I. 滑动窗口的最大值
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/12 17:13
 **/
public class Offer59I {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0||k==0) return new int[0];
        int[] arr=new int[nums.length-k+1];
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        arr[0]=deque.peekFirst();
        for (int i = k; i < nums.length ; i++) {
            if (deque.peekFirst()==nums[i-k]){
                deque.removeFirst();
            }
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            arr[i-k+1]=deque.peekFirst();
        }
        return arr;
    }
}
