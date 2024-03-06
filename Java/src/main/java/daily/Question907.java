package daily;

/**
 * 907. 子数组的最小值之和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/28 12:44
 **/
public class Question907 {
    public int sumSubarrayMins(int[] arr) {
        long result = 0;
        int[] stack = new int[arr.length]; // 使用数组结构模拟堆栈，里面存储arr数组的下标，为了便于计算“管辖区域”的跨度
        int head = 0, tail = head, mod = (int) (1e9 + 7); // 配合模拟堆栈的head指针和tail指针
        for (int i = 0; i <= arr.length; i++) {
            int num = (i == arr.length) ? 0 : arr[i]; // 如果arr数组遍历到最后一个元素，则还需要模拟结尾元素0，为了让stack中元素都出栈
            while (head != tail && arr[stack[tail - 1]] > num) {
                int n = stack[--tail]; // 待计算数字arr[n]的【数组下标】
                int h = (head != tail) ? stack[tail - 1] : -1; // arr[n]的“辐射区域”head头的【数组下标】（开区间）
                int t = i; // arr[n]的“辐射区域”tail尾的【数组下标】（开区间）
                result = (result + (long) (n - h) * (t - n) * arr[n]) % mod;
            }
            stack[tail++] = i;
        }
        return (int) result;
    }
//  暴力模拟超时
//    public int sumSubarrayMins(int[] arr) {
//        long num=0;
//        for (int i = 0; i < arr.length; i++) {
//            int mini=arr[i];
//            for (int j = i+1; j < arr.length; j++) {
//                num+=mini;
//                mini=Math.min(arr[j],mini);
//            }
//        }
//        return (int)(num%1000000007);
//    }
}
