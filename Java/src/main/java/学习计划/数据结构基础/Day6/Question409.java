package 学习计划.数据结构基础.Day6;

import java.util.HashMap;
import java.util.Map;

/**
 * 409. 最长回文串
 *
 * @author wenxingzhan
 * @date 2022/01/11 21:10
 **/
public class Question409 {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int num=0;
        int o=0;
        for(Integer i:map.values()){
            if(i%2==0){
                num+=i;
            }else{
                num+=i-1;
                o=1;
            }
        }
        return num+o;
    }
}
