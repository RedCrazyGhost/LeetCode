package daily;

/**
 * 1486. 数组异或操作
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/23 21:15
 **/
public class Question1486 {
    public int xorOperation(int n, int start) {
        int sum=start;
        for (int i = 1; i < n; i++) {
            sum^=start+2*i;
        }
        return sum;
    }
}
