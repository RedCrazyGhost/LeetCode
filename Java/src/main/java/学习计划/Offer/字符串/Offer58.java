package 学习计划.Offer.字符串;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/26 14:30
 **/
public class Offer58 {
    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        int offset=n%length;
        if (offset==0){
            return s;
        }
        s+=s;
        return s.substring(offset,length+offset);

    }
}
