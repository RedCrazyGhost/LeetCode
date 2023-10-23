package 每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * 969. 煎饼排序
 *
 * @author wenxingzhan
 * @date 2022/02/19 19:50
 **/
public class Question969 {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int n = arr.length; n > 1; n--) {
            int index = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] >= arr[index]) {
                    index = i;
                }
            }
            if (index == n - 1) {
                continue;
            }
            operation(arr, index);
            operation(arr, n - 1);
            list.add(index + 1);
            list.add(n);
        }
        return list;
    }
    public void operation(int[] arr,int end) {
        for (int i = 0, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
