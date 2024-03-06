package competition.Competition9;

/**
 * 攻防战
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/26 09:22
 **/
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr0=new int[len];
        int[] arr1=new int[len];
        String str=scanner.next();
        for (int i = 0; i <len ; i++) {
            if (str.charAt(i)=='0'){
                if (i==0){
                    arr0[i]=i+1;
                }else {
                    arr0[i] = arr0[i - 1] + i + 1;
                }
            }else{
                if (i==0) {
                    arr0[i] = 0;
                }else{
                    arr0[i] = arr0[i - 1];
                }
            }
        }
        for (int i = len-1; i >-1 ; i--) {
            if (str.charAt(i)=='1'){
                if(i==len-1){
                    arr1[i]=i+1;}else {
                    arr1[i] = arr1[i + 1] + i + 1;
                }
            }else{
                if (i==len-1){
                    arr1[i]=0;
                }else {
                    arr1[i] = arr1[i + 1];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        //下方两次循环有重叠的部分，还可以优化，但最总条件没有判断完全吧
        for (int i = 0; i < len; i++) {
            if (i!=len-1) {
                min = Math.min(min, Math.abs(arr0[i] - arr1[i + 1]));
            }else{
                min=Math.min(min,arr0[i]);
            }
        }
        for (int i = 0; i < len; i++) {
            if (i!=len-1){
                min=Math.min(min,Math.abs(arr1[i]-arr0[i+1]));
            }else{
                min=Math.min(min,arr1[i]);
            }
        }
        System.out.println(min);
    }
}
