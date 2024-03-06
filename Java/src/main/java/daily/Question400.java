package daily;

/**
 * 400. 第 N 位数字
 *
 * @author wenxingzhan
 * @date 2021/11/30 19:27
 **/
public class Question400 {
    public int findNthDigit(int n) {
        int d = 1, count = 9;
//        9位数表示2的32次方-1个位数
        while (n > (long) d * count) {
            n -= d * count;
            d++;
            count *= 10;
        }
        int index = n - 1;
        int start = (int) Math.pow(10, d - 1);
        int num = start + index / d;
        int digitIndex = index % d;
        int digit = (num / (int)(Math.pow(10, d - digitIndex - 1))) % 10;
        return digit;

    }
}
