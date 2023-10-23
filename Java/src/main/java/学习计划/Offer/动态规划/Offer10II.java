package 学习计划.Offer.动态规划;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 * 转移函数 f(n+1)=f(n)+f(n-1)
 * f(0)=1 f(1)=1
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/11 13:07
 **/
public class Offer10II {
    public int numWays(int n) {
        int a=1,b=1,sum;
        for (int j = 0; j < n; j++) {
            sum=(a+b)%1000000007;;
            a=b;
            b=sum;
        }
        return a;
    }
}
