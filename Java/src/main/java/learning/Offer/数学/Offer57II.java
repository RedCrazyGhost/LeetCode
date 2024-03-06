package learning.Offer.数学;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 57 - II. 和为s的连续正数序列
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/10 14:37
 **/
public class Offer57II {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list=new ArrayList<>();
        int left=1,right=2,sum=left+right;
        while(left<right){
            if (sum==target){
                int[] arr=new int[right-left+1];
                for (int i = left; i <= right; i++) {
                    arr[i-left]=i;
                }
                list.add(arr);
            }
            if (sum>=target){
                sum-=left;
                left++;
            }else{
                right++;
                sum+=right;
            }
        }
        return list.toArray(new int[0][]);
    }
}
