package learning.Offer.数学;

/**
 * 剑指 Offer 14- II. 剪绳子 II 中等 259
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/09 16:22
 **/
public class Offer14II {
    public int cuttingRope(int n) {
        if (n<=3) return n-1;
        int a=n/3,b=n%3;
        if (b==0) return (int) (Math.pow(3,a)%1000000007);
        if (b==1) return (int)(Math.pow(3,a-1)*4%1000000007);
        return (int) (Math.pow(3,a)*2%1000000007);
    }
}
