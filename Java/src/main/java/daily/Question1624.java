package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1624. 两个相同字符之间的最长子字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/17 22:37
 **/
public class Question1624 {
    //HashMap 优化
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer>map=new HashMap<>();
        for (int i = 0; i < s.length()/2; i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
        }
        int max=-1;
        for (int i = s.length()-1; i >s.length()/2 ; i--) {
            if (map.containsKey(s.charAt(i))){
                max=Math.max(max,i-map.get(s.charAt(i))-1);
            }
        }
        return max;

    }
//    暴力
//    public int maxLengthBetweenEqualCharacters(String s) {
//        Map<Character, List<Integer>>map=new HashMap<>();
//        char[] chars=s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            List<Integer> list=map.getOrDefault(chars[i],new ArrayList<>());
//            list.add(i);
//            map.put(chars[i],list);
//        }
//        int max=-1;
//        for (Map.Entry<Character,List<Integer>> entry:map.entrySet()) {
//            List<Integer> list=entry.getValue();
//            if (list.size()>=2){
//                max=Math.max(max,list.get(list.size()-1)-list.get(0)-1);
//            }
//        }
//
//        return max;
//    }
}
