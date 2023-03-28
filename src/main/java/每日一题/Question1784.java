package 每日一题;

/**
 * 1784. 检查二进制字符串字段
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/03 10:38
 **/
public class Question1784 {
    public boolean checkOnesSegment(String s) {
        boolean flag=true;
        char[] chars=s.toCharArray();
        for (char c : chars) {
            if (flag && c == '0') {
                flag = false;
            } else if (!flag && c == '1') {
                return false;
            }
        }
        return true;
    }
}
