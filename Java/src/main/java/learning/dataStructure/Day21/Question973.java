package learning.数据结构基础.Day21;

import java.util.*;

/**
 * 973. 最接近原点的 K 个点
 *
 * @author wenxingzhan
 * @date 2022/01/25 20:01
 **/
public class Question973 {
    public int[][] kClosest(int[][] points, int k) {
            Arrays.sort(points, new Comparator<int[]>() {
                public int compare(int[] point1, int[] point2) {
                    return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
                }
            });
            return Arrays.copyOfRange(points, 0, k);
        }
}
