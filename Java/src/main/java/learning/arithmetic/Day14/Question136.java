package learning.算法入门.Day14;

/**
 * 136. 只出现一次的数字
 *
 * @author wenxingzhan
 * @date 2022/01/07 17:07
 **/
public class Question136 {
    public int singleNumber(int[] nums) {
        int num=0;
        for (int j : nums) {
            num ^= j;
        }
        return num;
    }
}
