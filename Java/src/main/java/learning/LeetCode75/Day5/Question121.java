package learning.LeetCode75.Day5;

/**
 * 121. 买卖股票的最佳时机
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/31 11:35
 **/
public class Question121 {
    public int maxProfit(int[] prices) {
        int max = 0, buy=prices[0];
        for (int i = 1; i <prices.length ; i++) {
            if (buy<prices[i]){
                max=Math.max(max,prices[i]-buy);
            }
            if (buy>prices[i]){
                buy=prices[i];
            }
        }
        return max;
    }
}
