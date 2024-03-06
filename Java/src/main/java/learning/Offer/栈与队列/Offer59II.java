package learning.Offer.栈与队列;

/**
 * 剑指 Offer 59 - II. 队列的最大值
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/01 15:57
 **/
public class Offer59II {
    int[] q = new int[20000];
    int begin = 0, end = 0;

    public Offer59II() {

    }

    public int max_value() {
        int ans = -1;
        for (int i = begin; i != end; ++i) {
            ans = Math.max(ans, q[i]);
        }
        return ans;
    }

    public void push_back(int value) {
        q[end++] = value;
    }

    public int pop_front() {
        if (begin == end) {
            return -1;
        }
        return q[begin++];
    }

}
