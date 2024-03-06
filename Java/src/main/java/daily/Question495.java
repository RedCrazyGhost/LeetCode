package daily;

/**
 * 495. 提莫攻击
 *
 * @author wenxingzhan
 * @date 2021/11/10 12:24
 **/
public class Question495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum=0;
        if (timeSeries.length!=0){
            sum+=duration;
        }
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i]-timeSeries[i-1]>duration){
                sum+=duration;
            }else{
                sum+=timeSeries[i]-timeSeries[i-1];
            }
        }
        return sum;
    }
}
