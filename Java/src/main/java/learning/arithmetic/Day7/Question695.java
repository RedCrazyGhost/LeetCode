package learning.算法入门.Day7;

/**
 * 695. 岛屿的最大面积
 *
 * @author wenxingzhan
 * @date 2022/01/01 14:08
 **/
public class Question695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1){
                    max=Math.max(dfs(grid,i,j),max);
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int y,int x){
        if (grid[y][x]==0){
            return 0;
        }else{
            grid[y][x]=0;
            int num=1;
            if (y< grid.length-1){
                num+= dfs(grid, y+1, x);
            }
            if (x< grid[0].length-1){
                num+=dfs(grid, y, x+1);
            }
            if (0<y){
                num+=dfs(grid, y-1, x);
            }
            if (0<x){
                num+=dfs(grid, y, x-1);
            }
            return num;
        }



    }
}
