package 每日一题;

/**
 * 1863. 找出所有子集的异或总和再求和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/23 20:32
 **/
public class Question1863 {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        for (int num : nums) {
            sum |= num;
        }
        return sum<<(nums.length-1);
    }
}
