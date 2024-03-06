package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 2661. 找出叠涂元素
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/12/01 15:01
 **/
public class Question2661 {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];
        Map<Integer,int[]> map = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                map.put(mat[i][j],new int[]{i,j});
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int[] ints = map.get(arr[i]);
            rows[ints[0]]+=1;
            cols[ints[1]]+=1;
            if (rows[ints[0]] == mat[0].length || cols[ints[1]] == mat.length) return i;
        }
        return -1;
    }
}
