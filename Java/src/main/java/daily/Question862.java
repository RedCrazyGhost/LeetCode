package daily;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 862. 和至少为 K 的最短子数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/26 10:30
 **/
public class Question862 {
    // 前戳和
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] preSumArr = new long[n + 1];
        for (int i = 0; i < n; i++) {
            preSumArr[i + 1] = preSumArr[i] + nums[i];
        }
        int res = n + 1;
        Deque<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i <= n; i++) {
            long curSum = preSumArr[i];
            while (!queue.isEmpty() && curSum - preSumArr[queue.peekFirst()] >= k) {
                res = Math.min(res, i - queue.pollFirst());
            }
            while (!queue.isEmpty() && preSumArr[queue.peekLast()] >= curSum) {
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        return res < n + 1 ? res : -1;
    }


    //暴力解法，超时
//    public int shortestSubarray(int[] nums, int k) {
//        int count= Integer.MAX_VALUE,len=nums.length;
//        for (int i = 0; i < len; i++) {
//            int num=0,index=0;
//            while(index+i<len){
//                num+=nums[i+index++];
//                if (k==num){
//                    break;
//                }
//            }
//            if (num==k){
//                count=Math.min(count,index);
//            }
//        }
//        return count==Integer.MAX_VALUE?-1:count;
//    }
}
