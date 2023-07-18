package 学习计划.Offer.动态规划;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/12 23:12
 **/
public class Offer48 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0,j=-1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i)));
            }
            map.put(s.charAt(i),i);
            res=Math.max(res,i-j);
        }
        return res;
    }
}
