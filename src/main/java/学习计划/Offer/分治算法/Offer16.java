package 学习计划.Offer.分治算法;

/**
 * 剑指 Offer 16. 数值的整数次方
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/05 15:53
 **/
public class Offer16 {
    public double myPow(double x, int n) {
        if (n==0||x==1){
            return 1;
        }
        long N=n;
        if (N<0) {
            x = 1 / x;
            N=-N;
        }
        double step=x;
        for (int i = 1; i <N; i++) {
            x*=step;
        }
        return x;
    }
}
