package 每日一题;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1684. 统计一致字符串的数目
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/29 19:54
 **/
public class Question1684 {
    // 桶优化
    public int countConsistentStrings(String allowed, String[] words) {
        char[] chars=new char[26];
        for(char c:allowed.toCharArray()){
            chars[c-'a']+=1;
        }
        int num=0;
        top:for(String str:words){
            for(char c:str.toCharArray()){
                if (chars[c-'a']==0)continue top;
            }
            num+=1;
        }
        return num;
    }
//    public int countConsistentStrings(String allowed, String[] words) {
//        Set<Character> set=new HashSet<>();
//        for(char c:allowed.toCharArray()){
//            set.add(c);
//        }
//        int sum=0;
//       top: for(String str:words){
//           for(char c:str.toCharArray()){
//               if(!set.contains(c)){
//                   continue top;
//               }
//           }
//           sum+=1;
//        }
//        return  sum;
//    }
}
