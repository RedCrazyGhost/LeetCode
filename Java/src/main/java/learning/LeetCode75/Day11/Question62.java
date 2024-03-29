package learning.LeetCode75.Day11;

import java.util.Arrays;

/**
 * 62. 不同路径
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/06 10:08
 **/
public class Question62 {
    public int uniquePaths(int m, int n) {
        int[][] arr=new int[m][n];
        Arrays.fill(arr[0],1);
        for (int i = 1; i < m; i++) {
            arr[i][0]+=1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[m-1][n-1];
    }
}
