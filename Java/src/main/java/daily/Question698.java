package daily;

/**
 * 698. 划分为k个相等的子集
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/20 10:37
 **/
public class Question698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            num+=nums[i];
        }
        if (num%k==0){
            return true;
        }else{
            return false;
        }
    }
}
