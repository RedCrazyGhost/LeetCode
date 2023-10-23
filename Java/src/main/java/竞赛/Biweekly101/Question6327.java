package 竞赛.Biweekly101;

import java.util.HashSet;
import java.util.Set;

/**
 * 6327. 从两个数字数组里生成最小数字
 *
 * 输入：nums1 = [4,1,3], nums2 = [5,7]
 * 输出：15
 * 解释：数字 15 的数位 1 在 nums1 中出现，数位 5 在 nums2 中出现。15 是我们能得到的最小数字。
 * 45 47 15 17 35 37
 *
 * 输入：nums1 = [3,5,2,6], nums2 = [3,1,7]
 * 输出：3
 * 解释：数字 3 的数位 3 在两个数组中都出现了。
 * 33 31 37 53 51 57 23
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/01 22:31
 **/
public class Question6327 {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        int min1=Integer.MAX_VALUE;
        int middlemin=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for (int i : nums1) {
            min1=Math.min(i,min1);
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)){
                middlemin=Math.min(middlemin,i);
            }else{
                min2=Math.min(min2,i);
            }
        }
        if (middlemin!=Integer.MAX_VALUE){
            return middlemin;
        }else if (min1>min2){
            return min2*10+min1;
        }else{
            return min1*10+min2;
        }
    }
}
