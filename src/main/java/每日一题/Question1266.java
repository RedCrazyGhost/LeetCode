package 每日一题;

/**
 * 1266. 访问所有点的最小时间
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/29 19:45
 **/
public class Question1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for (int i = 0; i <points.length-1; i++) {
           sum+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        return sum;
    }
}
