package learning.LeetCode75.Day9;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 200. 岛屿数量
 * bfs 可能存在问题 时间复杂度没达标
 * 代码阅读性差  最佳处理方式-> 重构
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/04 10:49
 **/
public class Question200 {
    public int numIslands(char[][] grid) {
        int num=0;
        if (grid==null||grid.length==0){
            return num;
        }
        int[][] option=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        Queue<Integer> queue=new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    num+=1;
                    queue.add(i*grid[0].length+j);
                    while(!queue.isEmpty()){
                        int index = queue.poll();
                        grid[index/grid[0].length][index%grid[0].length]='0';
                        for (int[] ints : option) {
                            int y = index/grid[0].length + ints[0];
                            int x = index%grid[0].length + ints[1];

                            if (y > -1 && y < grid.length && x > -1 && x < grid[0].length && grid[y][x]=='1') {
                                queue.add(y*grid[0].length+x);
                            }
                        }
                    }
                }
            }
        }
        return num;
    }
}
