package 学习计划.算法入门.Day12;

/**
 * 70. 爬楼梯
 *
 * @author wenxingzhan
 * @date 2022/01/05 19:46
 **/
public class Question70 {
    public int climbStairs(int n) {
//        滚动数组
//        int a=0,b=0,c=1;
//        for (int i = 0; i < n; i++) {
//            a=b;
//            b=c;
//            c=a+b;
//        }
//        return c;

//        通项公式 x^2=x+1
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int) Math.round(fibn / sqrt5);

    }
}
