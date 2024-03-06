package daily;

/**
 * 1689. 十-二进制数的最少数目
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/26 15:47
 **/
public class Question1689 {
    public int minPartitions(String n) {
        int max=0;
        for (int i = 0; i < n.length(); i++) {
            max=Math.max(max,n.charAt(i)-'0');
        }
        return max;
    }
}
