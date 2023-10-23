package 学习计划.数据结构基础.Day14;

import java.util.Stack;

/**
 * 1823. 找出游戏的获胜者
 *
 * @author wenxingzhan
 * @date 2022/01/17 16:12
 **/
public class Question1823 {
    public int findTheWinner(int n, int k) {
        int dp = 1;
        for(int i = 0 ; i < n ; i++){
            dp = (dp + k - 1) % (i+1) + 1;
        }
        return dp;
    }
}
