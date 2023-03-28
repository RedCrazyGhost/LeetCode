package 每日一题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 748. 最短补全词
 *
 * @author wenxingzhan
 * @date 2021/12/10 12:02
 **/
public class Question748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] arr=new int[26];
        for (char c:licensePlate.toCharArray()){
            if ('a'<=c&&c<='z'){
                arr[c-'a']+=1;
            }else if('A'<=c&&c<='Z'){
                arr[c-'A']+=1;
            }
        }

        int[][] arr1=new int[words.length][26];
        String str=null;
      top:  for (int i = 0; i < words.length; i++) {
            for(char c:words[i].toCharArray()){
                arr1[i][c-'a']+=1;
            }
            for (int j = 0; j < 26; j++) {
               if (arr[j]!=arr1[i][j]){
                   if (arr1[i][j]-arr[j]<0){
                       continue top;
                   }
               }
            }
            if (str==null){
                str=words[i];
            }else{
                if (str.length()>words[i].length()){
                    str=words[i];
                }
            }
        }
        return str;
    }
}
