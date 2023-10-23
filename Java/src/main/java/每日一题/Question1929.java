package 每日一题;

/**
 * 1929. 数组串联
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/22 17:56
 **/
public class Question1929 {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len*2];
        for (int i = 0; i <len; i++) {
            arr[i]=nums[i];
            arr[i+len]=nums[i];
        }
        return arr;
    }
}
