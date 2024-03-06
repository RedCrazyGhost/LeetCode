package daily;

/**
 * 1822. 数组元素积的符号
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/27 11:51
 **/
public class Question1822 {
    public int arraySign(int[] nums) {
        int num=1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                return 0;
            }else if (nums[i]<0){
                num*=-1;
            }
        }
        return num;
    }
}
