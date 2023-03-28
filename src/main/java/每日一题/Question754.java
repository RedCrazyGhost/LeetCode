package 每日一题;

/**
 * 754. 到达终点数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/11/04 11:09
 **/
public class Question754 {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0) {
            k++;
            target -= k;
        }
        return target % 2 == 0 ? k : k + 1 + k % 2;
    }
}
