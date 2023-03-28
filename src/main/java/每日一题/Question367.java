package 每日一题;

/**
 * 367. 有效的完全平方数
 *
 * @author wenxingzhan
 * @date 2021/11/04 12:00
 **/
public class Question367 {
    public boolean isPerfectSquare(int num) {
        return (int) Math.pow((int)Math.sqrt(num),2)==num;
    }
}
