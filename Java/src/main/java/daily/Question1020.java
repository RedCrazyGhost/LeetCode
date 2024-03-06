package daily;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * 1020. 飞地的数量
 *
 * @author wenxingzhan
 * @date 2022/02/12 13:53
 **/
public class Question1020 {
    public int numEnclaves(int[][] g) {
        int m = g.length, n = g[0].length;
        boolean[][] vis = new boolean[m][n];
        Deque<int[]> d = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    if (g[i][j] == 0) continue;
                    vis[i][j] = true;
                    d.addLast(new int[]{i, j});
                }
            }
        }
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while (!d.isEmpty()) {
            int[] poll = d.pollFirst();
            int x = poll[0], y = poll[1];
            for (int[] di : dirs) {
                int nx = x + di[0], ny = y + di[1];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if (g[nx][ny] != 1) continue;
                if (vis[nx][ny]) continue;
                vis[nx][ny] = true;
                d.addLast(new int[]{nx, ny});
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 1 && !vis[i][j]) ans++;
            }
        }
        return ans;
    }
}
