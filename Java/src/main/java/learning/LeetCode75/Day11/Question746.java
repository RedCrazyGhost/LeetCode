package learning.LeetCode75.Day11;

/**
 * 746. 使用最小花费爬楼梯
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/06 09:55
 **/
public class Question746 {
    public int minCostClimbingStairs(int[] cost) {
        int len =cost.length;
        int[] dp=new int[len+1];
        dp[len-1]=cost[len-1];
        dp[len-2]=cost[len-2];
        for (int i =len-3 ; i >-1; i--) {
            dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        return Math.min(dp[0],dp[1]);
    }
}
