package daily;

/**
 * 905. 按奇偶排序数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/28 08:02
 **/
public class Question905 {
//    双指针
    public int[] sortArrayByParity(int[] nums) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                int num=nums[index];
                nums[index++]=nums[i];
                nums[i]=num;
            }
        }
        return nums;
    }
}
