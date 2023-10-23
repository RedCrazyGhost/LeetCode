package 竞赛.Competition6;

import java.util.Scanner;

/**
 * 题目 1255: 蓝桥杯算法提高-能量项链
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/25 11:04
 **/
public class QuestionOJ1255 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            int sumnum=0;
            int num=arr[i];
            for (int j = 1; j < n; j++) {
                int next0=(i+j)%n;
                int next1=(i+j+1)%n;
                sumnum+=arr[next0]*arr[next1]*num;
            }
            sum=Math.max(sum,sumnum);
        }
        System.out.println(sum);
    }
}
