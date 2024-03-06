package learning.Offer.搜索与回溯算法;

/**
 * 剑指 Offer 13. 机器人的运动范围
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/01 17:55
 **/
public class Offer13 {
    int m, n, k;
    boolean[][] record;
    public int movingCount(int m, int n, int k) {
        this.m = m; this.n = n; this.k = k;
        this.record = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }
    public int dfs(int i, int j, int si, int sj) {
        if(i >= m || j >= n || k < si + sj || record[i][j]) {
            return 0;
        }
        record[i][j] = true;
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj) + dfs(i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8);
    }

}
