package competition.Competition3;

/**
 * 2169. 得到 0 的操作数
 *
 * @author wenxingzhan
 * @date 2022/03/15 19:37
 **/
public class Question2169 {
    public int countOperations(int num1, int num2) {
        int num=0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            num += 1;
        }
        return num;
    }
}
