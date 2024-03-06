package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 1238. 循环码排列
 * 公式法
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/02/23 22:34
 **/
public class Question1238 {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 1<<n; i++) {
            list.add((i>>1)^i^start);
        }
        return list;
    }
}
