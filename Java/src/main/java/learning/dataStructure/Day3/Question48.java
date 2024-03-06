package learning.数据结构基础.Day3;

import java.util.Arrays;

/**
 * 48. 旋转图像
 *
 * @author wenxingzhan
 * @date 2022/01/12 11:56
 **/
public class Question48 {
    public void rotate(int[][] matrix) {
        int y = matrix.length , x = matrix[0].length ;

        int a = 0 , b = 0 , c = 0 , d = 0 ;

        for (int i = 0; i < y/2; i++) {
            for (int j = i; j < x-1-i; j++) {
                a = matrix[i][j] ;
                b = matrix[j][x-1-i] ;
                c = matrix[y-1-i][x-1-j] ;
                d = matrix[y-1-j][i] ;

                matrix[i][j] = d ;
                matrix[j][x-1-i] = a ;
                matrix[y-1-i][x-1-j] = b ;
                matrix[y-1-j][i] = c ;
            }
        }
    }
}
