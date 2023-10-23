package 排序;

/**
 * 排序算法类
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/12 18:35
 **/
public class Sort {


    // 冒泡排序
    public void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i ; j++) {
                if (nums[j]>nums[j+1]){
                    swap(j+1,j,nums);
                }
            }
        }
    }

    // 快速排序（不稳定）
    public int[] sortArray(int[] nums) {
        if (nums!=null) quickSort(0,nums.length-1,nums);
        return nums;
    }

    private void quickSort(int left,int right,int[] nums){
        if (left<right){
            int mid=partition(left,right,nums);
            quickSort(left,mid-1,nums);
            quickSort(mid+1,right,nums);
        }
    }

    private int partition(int left,int right,int[] nums){
        // 第一个作为基准参数
        int p=nums[left];
        while(left<right){
            while(left<right&&nums[right]>=p) right--;
            nums[left]=nums[right];
            while(left<right&&nums[left]<=p)++left;
            nums[right]=nums[left];
        }
        nums[left]=p;
        return left;
    }



    /**
     * 数组角标位置数值交换
     * @param i 第一个角标
     * @param j 第二个角标
     * @param nums 操作数组
     */
    private void swap(int i,int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
