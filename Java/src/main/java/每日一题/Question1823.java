package 每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * 1823. 找出游戏的获胜者
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/04 08:26
 **/
public class Question1823 {
//    DP 转移方程
    public int findTheWinner(int n, int k) {
        int index=0;
        for (int i = 1; i <=n; i++) {
            index=(index+k)%i;
        }
        return index+1;
    }
}
