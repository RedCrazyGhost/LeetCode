package 竞赛.Competition5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 成绩统计
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/21 20:18
 **/
public class QuestionF {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double Max=0;
        double Max1=0;
        double person=0;
        while(true){
            int num= (int) s.nextDouble();
            if(num !=0){
                person+=1;
                if (num>=60){
                    Max+=1;
                }
                if (num>=85){
                    Max1+=1;
                }
            }else{
                break;
            }
        }

        System.out.println((int)Math.rint(Max/person*100));
        System.out.println((int)Math.rint(Max1/person*100));

        /**
         * 7
         * 80
         * 92
         * 56
         * 74
         * 88
         * 100
         * 0
         *
         * 结果：
         * 71
         * 43
         */

    }
}
