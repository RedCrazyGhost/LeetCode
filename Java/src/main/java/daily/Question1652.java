package daily;

import java.util.Arrays;

/**
 * 1652. 拆炸弹
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/24 16:33
 **/
public class Question1652 {
    public int[] decrypt(int[] code, int k) {
        int index=0,len=code.length;
        int[] arr=new int[len];

        if(k>0){
           while(arr[index%len]==0){
               for (int i = 1; i <= k; i++) {
                   arr[index]+=code[(index+i)%len];
               }
               index+=1;
           }
        }else if (k<0){
            while(arr[index%len]==0){
                for (int i = k; i < 0; i++) {
                    arr[index]+=code[(len+index+i)%len];
                }
                index+=1;
            }
        }

        return  arr;
    }
}
