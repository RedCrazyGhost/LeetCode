package 每日一题;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 933. 最近的请求次数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/06 15:07
 **/
public class Question933 {
    Queue<Integer> queue;
    public Question933() {
        this.queue=new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.add(t);
        while(t-queue.peek()>3000){
            queue.poll();
        }
        return queue.size();
    }
}
