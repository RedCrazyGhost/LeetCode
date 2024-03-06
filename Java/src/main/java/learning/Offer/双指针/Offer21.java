package learning.Offer.双指针;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/31 14:37
 **/
public class Offer21 {
    public int[] exchange(int[] nums) {
        int[] arr=new int[nums.length];
        int left=0,right= nums.length-1;
        for(int i:nums){
            if (i%2==1){
                arr[left++]=i;
            }else{
                arr[right--]=i;
            }
        }
        return arr;
    }
}
