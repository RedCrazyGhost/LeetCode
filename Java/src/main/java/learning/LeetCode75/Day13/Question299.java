package learning.LeetCode75.Day13;

/**
 * 299. 猜数字游戏
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/08 16:21
 **/
public class Question299 {
    public String getHint(String secret, String guess) {
        int len =secret.length();
        int Bulls=0,Cows=0;
        int[] arr=new int[10];

        char[] charsS = secret.toCharArray();
        char[] charsG = guess.toCharArray();
        for (int i = 0; i < len; i++) {
            if (charsS[i]==charsG[i]){
                Bulls+=1;
            }else{
                arr[charsS[i]-'0']+=1;
                arr[charsG[i]-'0']-=1;
            }
        }
        for (int i : arr) {
            Cows+=Math.abs(i);
        }
        Cows=len-(Cows/2)-Bulls;


        return Bulls+"A"+Cows+"B";
    }
}
