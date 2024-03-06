package daily;

/**
 * 136. 只出现一次的数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/10/14 14:41
 **/
public class Question136 {
    public int singleNumber(int[] nums) {
       int num=0;
        for (int i : nums) {
            num^=i;
        }
        return num;
    }
}
