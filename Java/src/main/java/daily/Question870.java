package daily;

import java.util.*;

/**
 * 870. 优势洗牌
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/08 10:19
 **/
public class Question870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = map.getOrDefault(nums2[i], new ArrayList<>());
            list.add(i);
            map.put(nums2[i], list);
        }
        Arrays.sort(nums1); Arrays.sort(nums2);
        int[] ans = new int[n];
        for (int l1 = 0, l2 = 0, r2 = n - 1; l1 < n; l1++) {
            int t = nums1[l1] > nums2[l2] ? l2 : r2;
            List<Integer> list = map.get(nums2[t]);
            int idx = list.remove(list.size() - 1);
            ans[idx] = nums1[l1];
            if (t == l2) l2++;
            else r2--;
        }
        return ans;
    }
//    public int[] advantageCount(int[] nums1, int[] nums2) {
//        int n = nums1.length;
//        TreeSet<Integer> tset = new TreeSet<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int x : nums1) {
//            map.put(x, map.getOrDefault(x, 0) + 1);
//            if (map.get(x) == 1) tset.add(x);
//        }
//        int[] ans = new int[n];
//        for (int i = 0; i < n; i++) {
//            Integer cur = tset.ceiling(nums2[i] + 1);
//            if (cur == null) cur = tset.ceiling(-1);
//            ans[i] = cur;
//            map.put(cur, map.get(cur) - 1);
//            if (map.get(cur) == 0) tset.remove(cur);
//        }
//        return ans;
//    }
}
