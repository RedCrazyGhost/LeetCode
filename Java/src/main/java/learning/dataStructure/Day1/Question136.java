package learning.数据结构基础.Day1;

/**
 * 136. 只出现一次的数字
 *
 * @author wenxingzhan
 * @date 2021/12/28 19:46
 **/
public class Question136 {
    public int singleNumber(int[] nums) {
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num^=nums[i];
        }
        return num;
    }
}
