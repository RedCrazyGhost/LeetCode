package 每日一题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2133. 检查是否每一行每一列都包含全部整数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/20 13:25
 **/
public class Question2133 {
        public boolean checkValid(int[][] matrix) {
            int N = matrix.length;
            int [] t = new int[N + 1];
            Arrays.fill(t,1);
            t[0] = 0;
            int [][] count = new int[2 * N][N + 1];
            for(int i = 0;i < N;i++){
                /**
                 * 先计算横的！在计算竖的！
                 */
                for(int j = 0;j < N;j++){
                    count[i][matrix[i][j]]++;
                    count[i + N][matrix[j][i]] ++;
                }
                if(!Arrays.equals(count[i],t) || !Arrays.equals(count[i + N],t)){
                    return false;
                }
            }
            return true;
        }
    }