package 每日一题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 488. 祖玛游戏
 *
 * @author wenxingzhan
 * @date 2021/11/09 10:39
 **/
public class Question488 {
    public int findMinStep(String board, String hand) {
        int num = 0;
        StringBuilder sB = new StringBuilder(board);
        StringBuilder sH = new StringBuilder(hand);
        Map<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < sB.length(); i++) {
            map.put(sB.charAt(i),map.getOrDefault(sB.charAt(i),0)+1);
        }
        for (int i = 0; i < sH.length(); i++) {
            if (!map.containsKey(sH.charAt(i))) {
                sH.deleteCharAt(i);
            }
        }


        return 0;

    }
    public void delete3(StringBuilder sB){


    }


}
