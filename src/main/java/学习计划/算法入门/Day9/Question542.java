package 学习计划.算法入门.Day9;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 542. 01 矩阵
 *
 * @author wenxingzhan
 * @date 2022/01/03 13:31
 **/
public class Question542 {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//    广度优先 或 动态规划

    public int[][] updateMatrix(int[][] mat) {
        int[][] arr=new int[mat.length][mat[0].length];
        boolean[][] run=new boolean[mat.length][mat[0].length];
        Queue<int[]> queue=new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j]==0){
                    queue.offer(new int[]{i,j});
                    run[i][j]=true;
                }
            }
        }

        while(!queue.isEmpty()){
            int[] arr0= queue.poll();
            int y=arr0[0],x=arr0[1];
            for (int i = 0; i < 4; i++) {
                int iy= y + dirs[i][0];
                int ix= x + dirs[i][1];
                if (iy >= 0 && iy < mat.length && ix >= 0 && ix < mat[0].length && !run[iy][ix]) {
                    arr[iy][ix]=arr[y][x]+1;
                    queue.offer(new int[]{iy,ix});
                    run[iy][ix]=true;
                }

            }
        }




        return arr;
    }
}
