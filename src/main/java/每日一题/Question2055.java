package 每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * 2055. 蜡烛之间的盘子
 *
 * @author wenxingzhan
 * @date 2022/03/08 13:31
 **/
public class Question2055 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
//        暴力
        int[] resulte=new int[queries.length];
        char[] chars=s.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int index=-1;
            for (int j = queries[i][0]; j <=queries[i][1] ; j++) {
                if(chars[j]=='|'){
                    if (index != -1) {
                        resulte[i] += j - index - 1;
                    }
                    index=j;
                }
            }
        }
        return resulte;

    }
}
