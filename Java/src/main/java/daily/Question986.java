package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 986. 区间列表的交集
 *
 * @author wenxingzhan
 * @date 2021/11/11 19:24
 **/
public class Question986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int index0 = 0, index1 = 0;
        if (firstList.length == 0 || secondList.length == 0) {
            return new int[0][0];
        }
        List<int[]> list = new ArrayList<>();
//        while (index0 != firstList.length && index1 != secondList.length) {
//            int[] arr = new int[2];
//            arr[0] = Math.max(firstList[index0][0], secondList[index1][0]);
//            arr[1] = Math.min(firstList[index0][1], secondList[index1][1]);
//            if (arr[0] <= arr[1]) {
//                list.add(arr);
//            }
//            if (firstList[index0][1] < secondList[index1][1])
//                index0++;
//            else
//                index1++;
//        }

        for (int i = 0; i < firstList.length; i++) {
          o:  for (int j = 0; j < secondList.length; j++) {
                if (secondList[j][0]<firstList[i][1]){
                    break o;
                }else{
                    int[] arr = new int[2];
                    arr[0] = Math.max(firstList[i][0], secondList[j][0]);
                    arr[1] = Math.min(firstList[i][1], secondList[j][1]);
                    list.add(arr);
                }
            }
        }


        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}

