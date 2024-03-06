package daily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 769. 最多能完成排序的块
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/13 10:32
 **/
public class Question769 {
//    贪心
    class Solution {
        public int maxChunksToSorted(int[] arr) {
            int m = 0, res = 0;
            for (int i = 0; i < arr.length; i++) {
                m = Math.max(m, arr[i]);
                if (m == i) {
                    res++;
                }
            }
            return res;
        }
    }

//    HashSet
//    public int maxChunksToSorted(int[] arr) {
//        int[] narr= Arrays.copyOf(arr,arr.length);
//        Arrays.sort(narr);
//        int num=0;
//        Set<Integer> set=new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (set.contains(arr[i])){
//                set.remove(arr[i]);
//            }else {
//                set.add(arr[i]);
//            }
//            if (set.contains(narr[i])){
//                set.remove(narr[i]);
//            }else {
//                set.add(narr[i]);
//            }
//            if (set.size()==0){
//                num+=1;
//            }
//        }
//        return num;
//    }

}
