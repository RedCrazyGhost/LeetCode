package learning.Offer.数学;

/**
 * 剑指 Offer 66. 构建乘积数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/09 15:52
 **/
public class Offer66 {
    public int[] constructArr(int[] a) {
        int[] b=new int[a.length];
        for (int i = 0,c=1; i < a.length; i++) {
            b[i]=c;
            c*=a[i];
        }
        for (int i = a.length-1,c=1; i >-1; i--) {
            b[i]*=c;
            c*=a[i];
        }
        return b;
    }
}
