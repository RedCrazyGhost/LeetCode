package 每日一题;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1637. 两点之间不包含任何点的最宽垂直区域
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/30 14:43
 **/
public class Question1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int max = 0;
        for (int i = 1; i < points.length; i++) {
            max = Math.max(points[i][0] - points[i - 1][0], max);
        }
        return max;
    }
}
