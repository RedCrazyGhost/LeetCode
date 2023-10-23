package 每日一题;

public class Question566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr=new int[r][c];
        int i=0;
        if(mat.length*mat[0].length==c*r) {
            while (i < mat.length * mat[0].length) {
                arr[i / c][i % c] = mat[i / mat[0].length][i % mat[0].length];
                i++;
            }
            return arr;
        }else {
            return mat;
        }
    }
}
