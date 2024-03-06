package learning.数据结构基础.Day4;

/**
 * 240. 搜索二维矩阵 II
 *
 * @author wenxingzhan
 * @date 2022/01/12 13:54
 **/
public class Question240 {
    public boolean searchMatrix(int[][] matrix, int target) {
//        暴力 通过
//            for (int[] ints : matrix) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    if (target == ints[j]) {
//                        return true;
//                    }
//                }
//            }
//            return false;


        boolean flag=matrix.length==matrix[0].length;
        int minL=Math.min(matrix.length,matrix[0].length);
        int i=0;
        while(target>matrix[i][i]&&i<minL){
            i++;
        }
        if (flag){
            if (i==minL){
                return false;
            }else{
                for (int j = 0; j < minL; j++) {
                    if (target==matrix[i][j])return true;
                    if (target==matrix[j][i])return true;
                }
            }
        }else{
            if (matrix.length==minL) {
                for (int j = 0; j < minL; j++) {
                    for (int k = i; k < Math.max(matrix.length, matrix[0].length); k++) {
                        if (target == matrix[j][k]) return true;
                    }
                }
            }else {
                for (int j = i; j < Math.max(matrix.length, matrix[0].length); j++) {
                    for (int k = 0; k < minL; k++) {
                        if (target == matrix[j][k]) return true;
                    }
                }
            }
        }
        return false;
    }
}
