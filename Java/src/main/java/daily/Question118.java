package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 *
 * @author wenxingzhan
 * @date 2021/11/08 13:14
 **/
public class Question118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list1.add(1);
                }
                if (j > 0 && j < i - 1) {
                    list1.add(list.get(i-2).get(j) + list.get(i-2).get(j - 1));
                }
            }
            list.add(list1);
        }
        return list;
    }
}
