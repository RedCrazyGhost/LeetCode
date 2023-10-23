package 学习计划.Offer.数学;

/**
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/10 14:52
 **/
public class Offer62 {
//    DP 转移方程 x=(x+m)%n 约瑟夫环
public int lastRemaining(int n, int m) {
    int x = 0;
    for (int i = 2; i <= n; i++) {
        x = (x + m) % i;
    }
    return x;
}


//    public int lastRemaining(int n, int m) {
//        int[] arr=new int[n];
//        int index=0,step=0,size=n;
//        while(true){
//            if (arr[index]==0){
//                step++;
//            }
//            if (step==m&&size>1){
//                arr[index]=-1;
//                step=0;
//                size--;
//            } else if (step==m&&size==1) {
//                return index;
//            }
//            index=(index+1)%n;
//        }
//    }
}
