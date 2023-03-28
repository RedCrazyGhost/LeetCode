package 学习计划.算法入门.Day1;

/**
 * 二分查找 溢出问题
 *
 * @author wenxingzhan
 * @date 2021/12/25 18:42
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int start = 1;
        int end = 2147483647;              // 2^31 - 1
        System.out.println("数值未溢出的结果(符合人们的期望):"+start + (end - start) / 2);
        System.out.println("数值溢出的结果:"+(start + end) / 2);
    }
}
