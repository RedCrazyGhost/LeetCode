package learning.Offer.动态规划;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 * 转移函数 f(n+1)=f(n)+f(n-1)
 * f(0)=0 f(1)=1
 *  @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/11 12:59
 **/
public class Offer10I {


    public int fib(int n) {
       int a=0,b=1,sum;
        for (int j = 0; j < n; j++) {
            sum=(a+b)%1000000007;;
            a=b;
            b=sum;
        }
        return a;
    }
}
