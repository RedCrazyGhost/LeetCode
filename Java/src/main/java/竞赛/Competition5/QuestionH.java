package 竞赛.Competition5;

import java.util.Scanner;

/**
 * 数字三角形
 * dfs
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/21 20:33
 **/
public class QuestionH {
//5
//7
//3 8
//8 1 0
//2 7 4 4
//4 5 2 6 5
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int h=scanner.nextInt();
        int[][] arr=new int[h][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j]= scanner.nextInt();
            }
        }

        int sum=0;
        System.out.println(dfs(0,0,arr,sum,0,0));
    }
    public static int dfs(int indexY, int indexX, int[][] arr, int sum,int leftNum,int rightNum){
        if (indexX>=0&&indexX<arr.length&&indexY>=0&&indexY<arr.length){
            sum+=arr[indexY][indexX];
            return Math.max(dfs(indexY+1,indexX,arr,sum,leftNum+1,rightNum),
            dfs(indexY+1,indexX+1,arr,sum,leftNum,rightNum+1));
        }
        return sum;
    }
}
