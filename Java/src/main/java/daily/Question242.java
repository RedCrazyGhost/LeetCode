package daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 242. 有效的字母异位词
 *
 * @author wenxingzhan
 * @date 2021/11/06 12:23
 **/
public class Question242 {
    public boolean isAnagram(String s, String t) {
//        if (s.length()!=t.length()){
//            return false;
//        }else{
//            Map<Character,Integer> map=new HashMap<>();
//            for (int i = 0; i < s.length(); i++) {
//                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//                map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
//            }
//            for (int i:map.values()) {
//                if(i!=0){
//                    return false;
//                }
//            }
//            return true;
//        }
        

        if (s.length()!=t.length()){
            return false;
        }else{
            char[] chars1= s.toCharArray();
            char[] chars2= t.toCharArray();

            Arrays.sort(chars1);
            Arrays.sort(chars2);

            return Arrays.equals(chars1,chars2);
        }


    }
}
