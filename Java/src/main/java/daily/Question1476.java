package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 1476. 子矩形查询
 *
 * @author wenxingzhan
 * @date 2021/11/16 18:42
 **/
public class Question1476 {

    int[][] arr;
    public Question1476(int[][] rectangle) {
        arr=rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
               arr[i][j]=newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return arr[row][col];
    }
}
