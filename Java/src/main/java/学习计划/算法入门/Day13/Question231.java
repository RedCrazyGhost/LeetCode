package 学习计划.算法入门.Day13;

/**
 * 231. 2 的幂
 *
 * @author wenxingzhan
 * @date 2022/01/06 15:58
 **/
public class Question231 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while((n&1)==0){
            n>>=1;
        }
        return n == 1;

//        return n > 0 && (n & -n) == n;
    }
}
