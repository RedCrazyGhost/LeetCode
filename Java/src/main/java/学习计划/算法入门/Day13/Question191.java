package 学习计划.算法入门.Day13;

/**
 * 191. 位1的个数
 *
 * @author wenxingzhan
 * @date 2022/01/06 16:22
 **/
public class Question191 {
    public int hammingWeight(int n) {
        int num=0;
        while(n!=0){
            n&=n-1;
            num+=1;
        }
        return num;
    }
}
