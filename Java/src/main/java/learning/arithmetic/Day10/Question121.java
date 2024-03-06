package learning.算法入门.Day10;

public class Question121 {
    public int maxProfit(int[] prices) {
        int min=10000,max=0;
        for (int i = 0; i < prices.length; i++) {
            min=Math.min(prices[i],min);
            max=Math.max( prices[i]-min,max);
        }
        return max;
    }
}
