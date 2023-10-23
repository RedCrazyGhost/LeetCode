package 学习计划.LeetCode75.Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 438. 找到字符串中所有字母异位词
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/07 13:27
 **/
public class Question438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
        if (p.length()>s.length()){
            return list;
        }
        int[] arr=new int[26];
        for (char c : p.toCharArray()) {
            arr[c-'a']+=1;
        }
        int[] arr0=new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length()-p.length()+1; i++) {
            for (int j = 0; j < p.length(); j++) {
                arr0[chars[i+j]-'a']+=1;
            }
            if (Arrays.equals(arr,arr0)) {
                list.add(i);
            }
            Arrays.fill(arr0,0);
        }
        return list;
    }
}
