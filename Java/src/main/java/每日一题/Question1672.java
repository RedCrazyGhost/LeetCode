package 每日一题;

/**
 * 1672. 最富有客户的资产总量
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/14 15:57
 **/
public class Question1672 {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] arr:accounts){
            int num=0;
            for(int i:arr){
                num+=i;
            }
            max=Math.max(max,num);
        }
        return max;
    }
}
