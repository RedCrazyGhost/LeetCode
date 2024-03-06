package daily;

/**
 * 908. 最小差值 I
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/01 14:21
 **/
public class Question908 {
    public int smallestRangeI(int[] nums, int k) {
        int max= Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int num=Math.abs(max-min)-(2*k);
        return Math.max(num, 0);
    }
}
