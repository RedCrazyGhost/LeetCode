package 竞赛.Competition7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 试题 G: 数组切分
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/10 12:18
 **/
public class QuestionG {
    public void methode(){
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr=new int[len];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        for (int i = 2; i <=arr.length ; i++) {
         index:   for (int j = 0; j <= arr.length-i ; j++) {
                int[] test=new int[i];
                System.arraycopy(arr, j, test, 0, i);
                Arrays.sort(test);
                for (int k = 0; k < test.length-1; k++) {
                    if (Math.abs(test[k]-test[k+1])!=1){
                        continue index;
                    }
                }
                sum+=1;
            }
        }
        sum+=1;
        System.out.println(sum);
    }
}
