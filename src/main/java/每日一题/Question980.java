package 每日一题;

/**
 * 980. 不同路径 III
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/04 17:56
 **/
public class Question980 {

    public int uniquePathsIII(int[][] grid) {
        int count=0,x=-1,y=-1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==0){
                    count++;
                } else if (grid[i][j]==1){
                    x=j;
                    y=i;
                }
            }
        }
        return dfs(x,y,count+1,grid);
    }

    private int dfs(int x,int y,int count,int[][] grid){
        if (x<0||x>=grid[0].length||y<0||y>=grid.length||grid[y][x]<0)return 0;
        if (grid[y][x]==2) return count==0?1:0;
        grid[y][x]=-1;
        int res=dfs(x+1,y,count-1,grid)+
                dfs(x-1,y,count-1,grid)+
                dfs(x,y+1,count-1,grid)+
                dfs(x,y-1,count-1,grid);
        grid[y][x]=0;
        return res;
    }
}
