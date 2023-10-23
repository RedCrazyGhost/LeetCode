package 学习计划.Offer.位运算;

/**
 * 剑指 Offer 65. 不用加减乘除做加法
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/08 16:04
 **/
public class Offer65 {
    public int add(int a, int b) {
//        无进位 求和
        int sum=a^b;
//        进位
        int carry=(a&b)<<1;
        return carry==0?sum:add(sum,carry);
    }
}
