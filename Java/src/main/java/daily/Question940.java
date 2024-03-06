package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 940. 不同的子序列 II
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/14 10:07
 **/
public class Question940 {
    //DP 滚动存储
    public int distinctSubseqII(String s) {
        int mod = (int) 1e9 + 7;
        int n = s.length();
        //之前新增的个数
        int[] arr = new int[26];
        int curAns = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            //新增的个数
            int newCount = curAns;
            //当前序列的个数 = 之前的 + 新增的 - 重复的
            curAns = ((curAns + newCount) % mod - arr[chars[i] - 'a'] % mod + mod) % mod;
            //记录当前字符的 新增值
            arr[chars[i] - 'a'] = newCount;
        }
        //减去空串
        return curAns - 1;
    }
}
