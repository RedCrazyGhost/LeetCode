package 每日一题;

/**
 * 1828. 统计一个圆中点的数目
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/22 18:08
 **/
public class Question1828 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr=new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < points.length ; j++) {
                if( Math.sqrt(Math.pow(points[j][0] - queries[i][0], 2) + Math.pow(points[j][1] - queries[i][1], 2))<=queries[i][2]){
                    arr[i]+=1;
                }
            }
        }
        return arr;
    }
}
