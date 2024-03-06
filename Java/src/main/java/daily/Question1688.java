package daily;

/**
 * 1688. 比赛中的配对次数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/26 15:54
 **/
public class Question1688 {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n!=1){
            sum+=n/2;
            n=(n/2)+n%2;
        }
        return sum;
    }
}
