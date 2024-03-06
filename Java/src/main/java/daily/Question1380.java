package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 1380. 矩阵中的幸运数
 *
 * @author wenxingzhan
 * @date 2022/02/15 22:46
 **/
public class Question1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int o=0;
        for (int[] value : matrix) {
            int num = 100001;
            for (int j = 0; j < matrix[0].length; j++) {
                if (num > value[j]) {
                    num = value[j];
                    o = j;
                }
            }
            for (int[] ints : matrix) {
                if (num < ints[o]) {
                    num = -1;
                    break;
                }
            }
            if (num != -1) {
                list.add(num);
            }
        }
        return list;
    }
}
