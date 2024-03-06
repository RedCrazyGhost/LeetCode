package competition.Competition8;

import competition.Competition7.QuestionB;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * 岛屿最大面积
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/24 13:05
 **/
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int[][] arr=new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        BFS(arr);
        beforeDFS(arr);

    }

    //BFS 方法实现

    public static void BFS(int[][] arr){
        int row= arr.length;
        int col=arr[0].length;
        boolean[][] isRun=new boolean[row][col];
        Queue<int[]> queue=new ArrayDeque<>();
        int max=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]==0&&!isRun[i][j]){
                    queue.add(new int[]{i,j});
                }else{
                    continue;
                }
                int sum=0;
                while(!queue.isEmpty()){
                    int[] arr0=queue.poll();
                    int y=arr0[0];
                    int x=arr0[1];
                    if (y>=0&&y<row&&x>=0&&x<col&&!isRun[y][x]&&arr[y][x]!=1){
                        isRun[y][x]=true;
                        sum+=1;
                        queue.add(new int[]{y,x+1});
                        queue.add(new int[]{y,x-1});
                        queue.add(new int[]{y+1,x});
                        queue.add(new int[]{y-1,x});
                    }
                }
                max=Math.max(max,sum);
            }
        }
        System.out.println(max);
    }

    //DFS 方法实现
    public static void beforeDFS(int[][] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==0){
                    max=Math.max(DFS(arr,i,j),max);
                }
            }
        }
        System.out.println(max);
    }
    public static int DFS(int[][] grid, int y, int x) {
        if (grid[y][x] == 1) {
            return 0;
        } else {
            grid[y][x] = 1;
            int num = 1;
            if (y < grid.length - 1) {
                num += DFS(grid, y + 1, x);
            }
            if (x < grid[0].length - 1) {
                num += DFS(grid, y, x + 1);
            }
            if (0 < y) {
                num += DFS(grid, y - 1, x);
            }
            if (0 < x) {
                num += DFS(grid, y, x - 1);
            }
            return num;
        }
    }
}
