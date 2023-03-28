package 每日一题;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 745. 前缀和后缀搜索
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/07/14 09:55
 **/
public class Question745 {
    Map<String,Integer> map=null;

    public Question745(String[] words){
        map=new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j <= words[i].length(); j++) {
                for (int k = 1; k <= words[i].length(); k++) {
                    map.put(words[i].substring(0,j)+"-"+words[i].substring(words[i].length()-k),i );
                }
            }
        }
    }

    public int f(String pref, String suff) {
        return map.getOrDefault(pref+'-'+suff,-1);
    }
}
