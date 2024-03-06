package competition.Competition4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

/**
 * 蓝桥杯 题目 1096：扫雷
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/17 19:19
 **/
public class Question1096 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(),m= scanner.nextInt();
        char[][] chars=new char[n][m];
        int[][] arr=new int[n][m];
        Queue<Integer> q=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            chars[i]=scanner.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chars[i][j]=='*'){
                    q.offer(n*m+j);
                }
            }
        }
        System.out.println(q);
        while(!q.isEmpty()){
            int i=q.poll();
            int y=i/m,x=i%m;
            if (x<m-1&&chars[y][x+1]=='*'){
                arr[y][x+1]=-1;
            }else{
                arr[y][x+1]+=1;
            }

            if (x>0&&chars[y][x-1]=='*'){
                arr[y][x-1]=-1;
            }else{
                arr[y][x-1]+=1;
            }

            if (y<n-1&&chars[y+1][x]=='*'){
                arr[y+1][x]=-1;
            }else{
                arr[y+1][x]+=1;
            }
            if (y>0&&chars[y-1][x]=='*'){
                arr[y-1][x]=-1;
            }else{
                arr[y-1][x]+=1;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
