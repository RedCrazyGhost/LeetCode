package daily;

import java.util.*;

/**
 * 859. 亲密字符串
 *
 * @author wenxingzhan
 * @date 2021/11/23 08:03
 **/
public class Question859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length()){
            return false;
        }
        if (s.equals(goal)){
            int[] arr=new int[26];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i)-'a']+=1;
                if (arr[s.charAt(i)-'a']>1){
                    return true;
                }
            }
            return false;
        }else{
            int index0=-1,index1=-1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)!=goal.charAt(i)){
                   if (index0==-1){
                       index0=i;
                   }else if (index1==-1){
                       index1=i;
                   }else{
                       return false;
                   }
                }
            }
            return (index1!=-1&&s.charAt(index1)==goal.charAt(index0)&&s.charAt(index0)==goal.charAt(index1));
        }
    }
}
