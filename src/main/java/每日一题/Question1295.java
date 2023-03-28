package 每日一题;

/**
 * 1295. 统计位数为偶数的数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/02 20:31
 **/
public class Question1295 {
    public int findNumbers(int[] nums) {
        int sum=0;
        for(int i:nums){
            if(String.valueOf(i).length()%2==0){
                sum+=1;
            }
        }
        return sum;
    }
}
