package 学习计划.Offer.动态规划;

import java.util.Arrays;

/**
 * 剑指 Offer 60. n个骰子的点数
 * f(1)=6
 * f(2)=12
 * f(3)=17
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/18 22:22
 **/
public class Offer60 {
    public double[] dicesProbability(int n) {
        double[] arr=new double[6];
        Arrays.fill(arr,1.0/6.0);
        for (int i = 2; i <= n; i++) {
            double[] temp=new double[5*i+1];
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j+k]+=arr[j]/6.0;
                }
            }
            arr=temp;
        }
        return arr;
    }
}
