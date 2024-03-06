package daily;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 779. 第K个语法符号
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/20 10:15
 **/
public class Question779 {
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k - 1) & 1;
    }
}
