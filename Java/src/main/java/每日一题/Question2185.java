package 每日一题;

/**
 * 2185. 统计包含给定前缀的字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/01/08 13:29
 **/
public class Question2185 {
    public int prefixCount(String[] words, String pref) {
        int num=0;
        for (String str :words){
            if (str.startsWith(pref)) {
                num+=1;
            }
        }
        return num;
    }
}
