package learning.Offer.分治算法;

/**
 * 剑指 Offer 51. 数组中的逆序对
 * 使用分治思想归并排序  暴力方法效果差
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/06 14:12
 **/
public class Offer51 {
    int[] nums,temp;
    public int reversePairs(int[] nums) {
        this.nums=nums;
        temp=new int[nums.length];
        return dfs(0,nums.length-1);
    }

    private int dfs(int left, int right) {
        if (left>=right) return 0;
        int mid=left+(right-left)/2;
        int num=dfs(left,mid)+dfs(mid+1,right);

        int i=left,j=mid+1;
        for (int k = left; k <=right; k++) {
            temp[k]=nums[k];
        }
        for (int k = left; k <=right ; k++) {
            if (i==mid+1){
                nums[k]=temp[j++];
            }else if (j==right+1||temp[i]<=temp[j]){
                nums[k]=temp[i++];
            }else{
                nums[k]=temp[j++];
                num+=mid-i+1;
            }
        }
        return num;

    }


//    暴力方法
//    public int reversePairs(int[] nums) {
//        int num=0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]>nums[j]) num+=1;
//            }
//        }
//        return  num;
//    }
}
