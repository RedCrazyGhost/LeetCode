package 每日一题;

/**
 * 2022. 将一维数组转变成二维数组
 *
 * @author wenxingzhan
 * @date 2022/01/01 17:30
 **/
public class Question2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length!=m*n){
            return new int[0][];
        }
        int[][] arr=new int[m][n];
        for (int i = 0; i < original.length; i++) {
            arr[i/n][i%n]=original[i];
        }
        return arr;
    }
}
