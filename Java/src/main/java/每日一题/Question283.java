package 每日一题;

/**
 * 283. 移动零
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/13 19:46
 **/
public class Question283 {

//    双指针
    public void moveZeroes(int[] nums) {
        int zero=0,left=0,len=nums.length;

        while(left+zero<len){
            while(left+zero<len&&nums[left+zero]==0) zero++;
            for (int j = 0; left+j+zero<len&&j < zero; j++) {
                nums[left+j]=nums[left+j+zero];
            }
            left++;
        }
        for (int i = 0; i < zero; i++) {
            nums[nums.length-1-i]=0;
        }
    }

//  冒泡
//    public void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]==0){
//                    int temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
//    }

//    移动0至末尾并且排序（不符合题意，题意不排序）
//    public void moveZeroes(int[] nums) {
//        int zero=0;
//        for (int i = 0; i < nums.length; i++) {
//            int num=nums[i];
//            if (nums[i]==0){
//               num=Integer.MAX_VALUE;
//               zero++;
//            }
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[j]<num&&nums[j]!=0){
//                    int temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                    num=nums[i];
//                }
//            }
//        }
//    }
}
