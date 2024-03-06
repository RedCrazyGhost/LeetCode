package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.02. 判定是否互为字符重排
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/27 16:03
 **/
public class QuestionInterview0102 {
    public boolean CheckPermutation(String s1, String s2) {
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int num=0;
        for (char c:s2.toCharArray()){
            num=map.getOrDefault(c,0);
            if(num<=0){
                return false;
            }else{
                map.put(c,num-1);
            }
        }
        return true;
    }
//    public boolean CheckPermutation(String s1, String s2) {
//        if (s1.length()!=s2.length()){
//            return false;
//        }
//        int[] arr=new int[52];
//        for(char c:s1.toCharArray()){
//            if (c>='a'){
//                arr[c-'a']+=1;
//            }else{
//                arr[c-'A'+26]+=1;
//            }
//        }
//        for(char c: s2.toCharArray()){
//            if (c>='a'){
//                arr[c-'a']-=1;
//                if (arr[c-'a']<0){
//                    return false;
//                }
//            }else{
//                arr[c-'A'+26]-=1;
//                if (arr[c-'A'+26]<0){
//                    return false;
//                }
//            }
//        }
//        return  true;
//    }
}
