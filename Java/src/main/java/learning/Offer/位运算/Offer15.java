package learning.Offer.位运算;

/**
 * 剑指 Offer 15. 二进制中1的个数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/08 15:47
 **/
public class Offer15 {
    public int hammingWeight(int n) {
        int num=0;
        while(n!=0){
            if ((n&1)==1) num++;
            n>>>=1;
        }
        return num;
    }
}
