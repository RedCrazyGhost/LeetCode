package 每日一题;

import java.util.*;

/**
 * 1705. 吃苹果的最大数目
 *
 * @author wenxingzhan
 * @date 2021/12/24 11:07
 **/
public class Question1705 {
/*
class Solution {
    public int eatenApples(int[] apples, int[] days) {
        int ans = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        int n = apples.length;
        int i = 0;
        while (i < n) {
            while (!pq.isEmpty() && pq.peek()[0] <= i) {
                pq.poll();
            }
            int rottenDay = i + days[i];
            int count = apples[i];
            if (count > 0) {
                pq.offer(new int[]{rottenDay, count});
            }
            if (!pq.isEmpty()) {
                int[] arr = pq.peek();
                arr[1]--;
                if (arr[1] == 0) {
                    pq.poll();
                }
                ans++;
            }
            i++;
        }
        while (!pq.isEmpty()) {
            while (!pq.isEmpty() && pq.peek()[0] <= i) {
                pq.poll();
            }
            if (pq.isEmpty()) {
                break;
            }
            int[] arr = pq.poll();
            int curr = Math.min(arr[0] - i, arr[1]);
            ans += curr;
            i += curr;
        }
        return ans;
    }
}

作者：Main-Solution
链接：https://leetcode-cn.com/problems/maximum-number-of-eaten-apples/solution/chi-ping-guo-de-zui-da-shu-mu-by-leetcod-93ka/
来源：力扣（Main）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
//    使用队列
    public int eatenApples(int[] apples, int[] days) {
        return 1;
    }
}
