package competition.Competition6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目 1110: 2^k进制数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/25 09:44
 **/
public class QuestionOJ1110 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt(),w=scanner.nextInt();
        int i= (int) Math.pow(2,k),j=w%k;
    }

}
