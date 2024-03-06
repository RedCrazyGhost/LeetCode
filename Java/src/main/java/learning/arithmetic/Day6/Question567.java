package learning.算法入门.Day6;

import java.util.Arrays;

/**
 * 567. 字符串的排列
 *
 * @author wenxingzhan
 * @date 2021/12/31 14:49
 **/
public class Question567 {
    public boolean checkInclusion(String s1, String s2) {
        boolean flag=false;
        if (s1.length()>s2.length()){
        return  flag;
        }
        int[] arr=new int[26];
        for(char c:s1.toCharArray()){
            arr[c-'a']+=1;
        }
       top: for (int i = 0; i <=s2.length()-s1.length() ; i++) {
            int[] optionarr=Arrays.copyOf(arr,arr.length);
            for (int j = i; j < s1.length()+i; j++) {
                if ((optionarr[s2.charAt(j)-'a']-=1)<0){
                    continue top;
                }
            }
            flag=true;
        }
        return flag;
    }
}
