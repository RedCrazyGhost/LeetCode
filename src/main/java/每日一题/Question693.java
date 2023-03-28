package 每日一题;

/**
 * 693. 交替位二进制数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/28 16:54
 **/
public class Question693 {
    public boolean hasAlternatingBits(int n) {
          int m=n^(n+1);
        return (m&(m+1))==0;
    }
}
