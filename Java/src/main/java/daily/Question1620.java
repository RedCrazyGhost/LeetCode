package daily;

import java.util.*;

/**
 * 1620. 网络信号最好的坐标
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/11/02 10:19
 **/
public class Question1620 {
    // 暴力枚举
    public int[] bestCoordinate(int[][] towers, int radius) {
        int max = 0;
        int[] arr = new int[2];
        for (int i = 0; i < 51; ++i) {
            for (int j = 0; j < 51; ++j) {
                int t = 0;
                for (var e : towers) {
                    double d = Math.sqrt((i - e[0]) * (i - e[0]) + (j - e[1]) * (j - e[1]));
                    if (d <= radius) {
                        t += Math.floor(e[2] / (1 + d));
                    }
                }
                if (max < t) {
                    max = t;
                    arr[0] =i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
