package daily;

/**
 * 1545. 找出第 N 个二进制字符串中的第 K 位
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/07 14:05
 **/
public class Question1545 {
    //DP
    public char findKthBit(int n, int k) {
        if(n == 1)
            return '0';
        int mid = 1 << (n-1);
        if(k < mid)
            return findKthBit(n-1, k);
        else if(k == mid)
            return '1';
        else{
            k = mid-(k-mid);
            return findKthBit(n-1, k) == '0' ? '1' : '0';
        }
    }
}
