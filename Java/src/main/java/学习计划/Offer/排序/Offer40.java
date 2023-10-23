package 学习计划.Offer.排序;

import java.util.Arrays;

/**
 * 剑指 Offer 40. 最小的k个数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/07 14:56
 **/
public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
       return Arrays.copyOf(arr,k);
    }
}
