import java.util.ArrayList;
import java.util.List;

/**
 * 228. 汇总区间
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/26 18:25
 **/
public class Question228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>(nums.length);
        if (nums.length==0) return list;
        int left=0,mid=0,right=1;
        while (right<=nums.length){
            if (right< nums.length&&nums[mid]+1==nums[right]){
                mid++;
                right++;
            }else{
                if (left!=mid){
                    list.add(nums[left]+"->"+nums[mid]);
                }else{
                    list.add(String.valueOf(nums[left]));
                }
                left=right;
                mid=left;
                right=mid+1;
            }
        }
        return list;
    }
}
