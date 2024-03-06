package daily;

/**
 * 540. 有序数组中的单一元素
 *
 * @author wenxingzhan
 * @date 2022/02/14 15:00
 **/
public class Question540 {
    public int singleNonDuplicate(int[] nums) {
//        if (nums.length==1){
//            return nums[0];
//        }
//        for (int i = 1; i < nums.length-1; i++) {
//            if(nums[i]!=nums[i-1]&&nums[i+1]!=nums[i]){
//                return nums[i];
//            }
//        }
//        if (nums[1]!=nums[0]){
//            return nums[0];
//        }
//        if (nums[nums.length-1]!=nums[nums.length-2]){
//            return nums[nums.length-1];
//        }
//        return -1;

        if (nums.length==1){
            return nums[0];
        }
        int i=0;
        for (; i < nums.length-1; i++) {
            if (nums[i]!=nums[i+1]){
                return nums[i];
            }else{
                i+=1;
            }
        }
        return nums[i];
    }
}
