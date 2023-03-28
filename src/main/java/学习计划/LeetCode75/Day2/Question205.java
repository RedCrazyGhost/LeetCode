package 学习计划.LeetCode75.Day2;

import com.sun.tools.javac.Main;

import java.util.HashMap;

/**
 * 205. 同构字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/28 16:15
 **/
public class Question205 {
    /**
     * 判断s和t是否同构
     * 使用字母桶存放映射字母
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapS=new HashMap<>();
        HashMap<Character,Character> mapT=new HashMap<>();
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        int len = charsT.length;
        for (int i = 0; i < len; i++) {
            if (!mapS.containsKey(charsS[i])&&!mapT.containsKey(charsT[i])) {
                mapS.put(charsS[i], charsT[i]);
                mapT.put(charsT[i], charsS[i]);
            }else if (mapS.containsKey(charsS[i])&&mapT.containsKey(charsT[i])){
                if( mapS.get(charsS[i])!=charsT[i]||mapT.get(charsT[i])!=charsS[i]){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

}
