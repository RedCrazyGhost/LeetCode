package daily;

import java.util.Arrays;

/**
 * 2160. 拆分数位后四位数字的最小和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/23 20:58
 **/
public class Question2160 {
    public int minimumSum(int num) {
        int[] arr=new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        return arr[0]*10+arr[3]+arr[1]*10+arr[2];
    }
}
