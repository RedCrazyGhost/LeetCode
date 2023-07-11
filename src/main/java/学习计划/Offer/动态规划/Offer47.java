package 学习计划.Offer.动态规划;

/**
 * 剑指 Offer 47. 礼物的最大价值
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/11 14:19
 **/
public class Offer47 {
    public int maxValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i==0&&j==0) continue;
                if (i==0){
                    grid[i][j]+=grid[i][j-1];
                }else if (j==0){
                    grid[i][j]+=grid[i-1][j];
                }else{
                    grid[i][j]+=Math.max(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
