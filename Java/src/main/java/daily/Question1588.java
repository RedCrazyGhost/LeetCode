package daily;

/**
 * 1588. 所有奇数长度子数组的和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/27 17:30
 **/
public class Question1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int length = 1; start + length <= n; length += 2) {
                int end = start + length - 1;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
            }
        }
        return sum;
    }
}
