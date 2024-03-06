package competition.Biweekly101;

import java.util.HashMap;

/**
 * 6328. 找到最大开销的子字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/01 22:36
 **/
public class Question6328 {

    public int maximumCostSubstring(String s, String chars, int[] vals) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len = vals.length;
        for (int i = 0; i <len ; i++) {
            map.put(chars.charAt(i),vals[i]);
        }

        int num=0,middel=0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            Integer val = map.getOrDefault(c, (int) (c - 'a' + 1));
            if (middel + val >= 0) {
                middel +=val;
                num = Math.max(num, middel);
            } else {
                middel = 0;
            }
        }

        return num;
    }
}
