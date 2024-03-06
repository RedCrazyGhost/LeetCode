package daily;

/**
 * 521. 最长特殊序列 Ⅰ
 *
 * @author wenxingzhan
 * @date 2022/03/05 23:32
 **/
public class Question521 {
    public int findLUSlength(String a, String b) {
       return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
