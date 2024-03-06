package learning.Offer.动态规划;

/**
 * 剑指 Offer 63. 股票的最大利润
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/11 13:12
 **/
public class Offer63 {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=0;
        for (int price : prices) {
            min=Math.min(min,price);
            max=Math.max(max,price-min);
        }
        return max;
    }
}
