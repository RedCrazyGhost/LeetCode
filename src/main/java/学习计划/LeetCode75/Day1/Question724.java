package 学习计划.LeetCode75.Day1;

/**
 * 724. 寻找数组的中心下标
 * 中心下标不参与计算
 * 左边子数组的元素和 等于 右边子数组的元素和
 * 子数组可为空 无元素则值为0 左右同理
 * 如果存在多个中心下标 返回最左侧的（贪心）
 * 如果不存在则返回-1
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/3/29 15:11
 **/

public class Question724 {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        for (int i = len-2; i >-1 ; i--) {
            arr[i]=nums[i+1]+arr[i+1];
        }
        int num=0;
        for (int i = 0; i < len; i++) {
            if (arr[i]-num==0){
                return i;
            }else{
                num+=nums[i];
            }
        }
        return -1;
    }
}
