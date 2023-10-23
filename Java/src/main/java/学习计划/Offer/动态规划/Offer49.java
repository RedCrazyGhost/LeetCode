package 学习计划.Offer.动态规划;

/**
 * 剑指 Offer 49. 丑数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/12 23:43
 **/
public class Offer49 {
    public int nthUglyNumber(int n) {
        int a=0,b=0,c=0;
        int[] arr=new int[n];
        arr[0]=1;
        for (int i = 1; i < n; i++) {
            int n2=arr[a]*2,n3=arr[b]*3,n5=arr[c]*5;
            arr[i]=Math.min(Math.min(n2,n3),n5);
            if (arr[i]==n2) a++;
            if (arr[i]==n3) b++;
            if (arr[i]==n5) c++;
        }
        return arr[n-1];
    }
}
