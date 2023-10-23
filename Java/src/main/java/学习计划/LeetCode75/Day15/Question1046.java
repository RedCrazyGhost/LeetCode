package 学习计划.LeetCode75.Day15;

import java.util.PriorityQueue;

/**
 * 1046. 最后一块石头的重量
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/10 12:00
 **/
public class Question1046 {
    // 1 1 2 4 7 8
    // 1 1 2 4 0 1
    // 1 1 2 3 0 0
    // 1 1 0 1 0 0
    // 1 0 0 0 0 0

    // 1 1 2 4 7 8
    // 0 0 0 2 0 1
    // 0 0 0 1 0 0

    //大顶堆
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while(pq.size()>1){
            int a= pq.poll();
            int b= pq.poll();
            if (a>b){
                pq.offer(a-b);
            }
        }
        return pq.isEmpty()?0: pq.poll();

    }
}
