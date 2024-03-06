package daily;

/**
 * 137. 只出现一次的数字 II
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/10/15 22:46
 **/
public class Question137 {
    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for (int num : nums) {
            b = ~a & (b ^ num);
            a = ~b & (a ^ num);
        }
        return b;
    }
}
