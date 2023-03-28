package 竞赛.Competition6;

import java.util.Scanner;

/**
 * 题目 1435: 蓝桥杯历届试题-国王的烦恼
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/25 10:49
 **/
public class QuestionOJ1435 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int n= scanner.nextInt(),m= scanner.nextInt();
        int day=0;
        int[][] arr=new int[m][3];
        for (int i = 0; i < m; i++) {
            arr[i][0]= scanner.nextInt();
            arr[i][1]= scanner.nextInt();
            arr[i][2]= scanner.nextInt();
            day=Math.max(arr[i][2],day);
        }


        for (int i = 0; i < day; i++) {
            
        }
    }
}
