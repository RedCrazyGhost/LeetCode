package 每日一题;

/**
 * 1572. 矩阵对角线元素的和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/03 12:45
 **/
public class Question1572 {
    public int diagonalSum(int[][] mat) {
        boolean[][] isRun=new boolean[mat.length][mat.length];
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            sum+=mat[i][i];
            isRun[i][i]=true;
        }
        for (int i = mat.length-1; i >-1 ; i--) {
            sum+= isRun[i][mat.length-1-i]?0:mat[i][mat.length-1-i];
        }
        return sum;
    }
}
