package learning.算法入门.Day12;

import java.util.List;

/**
 * 120. 三角形最小路径和
 *
 * @author wenxingzhan
 * @date 2022/01/05 19:59
 **/
public class Question120 {
    public int minimumTotal(List<List<Integer>> triangle) {
//        官方
        int n = triangle.size();
        int[] f = new int[n];
        f[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            f[i] = f[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; --j) {
                f[j] = Math.min(f[j - 1], f[j]) + triangle.get(i).get(j);
            }
            f[0] += triangle.get(i).get(0);
        }
        int minTotal = f[0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[i]);
        }
        return minTotal;
    }
}
