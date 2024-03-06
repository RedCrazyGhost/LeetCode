package daily;

import java.util.Arrays;

/**
 * 2028. 找出缺失的观测数据
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/27 16:56
 **/
public class Question2028 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
       int msum=0,total=mean*(n+ rolls.length);
       for(int i:rolls){
           msum+=i;
       }
       int num=total-msum;
       switch (num/n){
           case 6:
                if (num%n!=0){
                    return new int[]{};
                }
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
                int[] arr=new int[n];
                Arrays.fill(arr,num/n);
               for (int i = 0; i < num%n; i++) {
                   arr[i]+=1;
               }
               return arr;
           default:
               return new int[]{};
       }
    }
}
