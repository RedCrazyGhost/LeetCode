package 每日一题;

import java.util.Arrays;

/**
 * 2500. 删除每行中的最大值
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/27 14:18
 **/
public class Question2500 {
    public int deleteGreatestValue(int[][] grid) {
        int sum=0;
        int row=grid.length,col=grid[0].length;
//        int[] arr=new int[row*col];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=grid[i/col][i%col];
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < col; i++) {
//            sum+=arr[arr.length-1-(i*row)];
//        }

        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        for (int i = 0; i < col; i++) {
            int max=grid[0][i];
            for (int j = 1; j < row; j++) {
                max=Math.max(max,grid[j][i]);
            }
            sum+=max;
        }

        return sum;
    }
}
