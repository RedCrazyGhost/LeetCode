package daily;

import java.util.*;

/**
 * 面试题 01.08. 零矩阵
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/30 16:25
 **/
public class QuestionInterview0108 {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length,l=matrix[0].length;
        boolean[] rows=new boolean[r];
        boolean[] lines=new boolean[l];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j]==0){
                    rows[i]=true;
                    lines[j]=true;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                if (rows[i]||lines[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
//    下方方法模拟性能不佳
//    public void setZeroes(int[][] matrix) {
//        Set<Integer> rows=new HashSet<>();
//        Set<Integer>lines=new HashSet<>();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j]==0){
//                    rows.add(i);
//                    lines.add(j);
//                }
//            }
//        }
//        for(int i:rows){
//            Arrays.fill(matrix[i],0);
//        }
//        for(int i:lines){
//            for (int j = 0; j < matrix.length; j++) {
//                matrix[j][i]=0;
//            }
//        }
//    }
}
