package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 299. 猜数字游戏
 *
 * @author wenxingzhan
 * @date 2021/11/08 10:07
 **/
public class Question299 {
    public String getHint(String secret, String guess) {
        char[] chars0=secret.toCharArray();
        char[] chars1=guess.toCharArray();
        int numA=0,numB=0;
        Map<Character,Integer>map0=new HashMap<>();
        Map<Character,Integer>map1=new HashMap<>();
        for (int i = 0; i < chars0.length; i++) {
            if(chars0[i]==chars1[i]){
                numA++;
            }else{
                map0.put(chars0[i],map0.getOrDefault(chars0[i],0)+1);
                map1.put(chars1[i],map1.getOrDefault(chars1[i],0)+1);
            }
        }
        if (!map0.isEmpty()) {
            for (char c : map0.keySet()) {
                if (map1.getOrDefault(c,0)!=0) {
                    numB += Math.min(map0.get(c), map1.getOrDefault(c, 1001));
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        sb.append(numA);
        sb.append('A');
        sb.append(numB);
        sb.append('B');

        return sb.toString();
        
    }
}
