package learning.Offer.查找算法;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/28 17:39
 **/
public class Offer11 {
//    超常规解法
//    public int minArray(int[] numbers) {
//        Arrays.sort(numbers);
//        return numbers[0];
//    }

//    二分查找
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }
}
