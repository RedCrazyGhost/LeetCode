package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 997. 找到小镇的法官
 *
 * @author wenxingzhan
 * @date 2021/12/19 11:54
 **/
public class Question997 {
    public int findJudge(int n, int[][] trust) {
        if (n!=1) {
            int[] arr = new int[n + 1];
            for (int i = 0; i < trust.length; i++) {
                arr[trust[i][1]] += 1;
                arr[trust[i][0]] -= 1;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n - 1) {
                    return i;
                }
            }
            return -1;
        }
        return 1;
    }
}
