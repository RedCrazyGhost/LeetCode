package learning.LeetCode75.Day5;

import java.util.HashMap;
import java.util.Map;

/**
 * 409. 最长回文串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/31 11:45
 **/
public class Question409 {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        int len=0;
        boolean isHaveOne=false;
        for (Integer value : map.values()) {
            int a=value/2;
            int b=value%2;
            if (a!=0){
                len+=a*2;
            }
            if (b==1&&!isHaveOne){
                len+=1;
                isHaveOne=true;
            }
        }
        return len;
    }
}
