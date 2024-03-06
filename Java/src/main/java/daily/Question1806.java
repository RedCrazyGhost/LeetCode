package daily;

import java.util.Arrays;

/**
 * 1806. 还原排列的最少操作步数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/01/09 15:11
 **/
public class Question1806 {

    //暴力模拟，还有可优化的空间
    public int reinitializePermutation(int n) {
        int[] perm=new int[n],arr=new int[n];
        for (int i = 0; i < perm.length; i++) {
            perm[i]=i;
        }
        int num=0;
        int[] ints = Arrays.copyOf(perm, n);
        while(!Arrays.equals(arr,perm)) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] = ints[i / 2];
                } else {
                    arr[i] = ints[n / 2 + (i - 1) / 2];
                }
            }
            ints=Arrays.copyOf(arr, n);
            num+=1;
        }
        return num;
    }
}
