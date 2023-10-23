package 学习计划.算法入门.Day3;

/**
 * 283. 移动零
 *
 * @author wenxingzhan
 * @date 2021/12/27 14:10
 **/
public class Question283 {
    public void moveZeroes(int[] nums) {
       int index0=0,index1=0;
       while(index0< nums.length){
           if (nums[index0]==0){
               index0+=1;
           }else if (nums[index0]!=0&&nums[index1]==0){
               swap(nums,index0,index1);
               index0+=1;
               index1+=1;
           }
       }
    }
    public void swap(int[] nums,int oldindex,int newindex){
        int temp=nums[oldindex];
        nums[oldindex]=nums[newindex];
        nums[newindex]=temp;
    }
}
