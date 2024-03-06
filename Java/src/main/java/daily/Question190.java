package daily;

/**
 * 190. 颠倒二进制位
 *
 * @author wenxingzhan
 * @date 2021/12/07 21:58
 **/
public class Question190 {
    public int reverseBits(int n) {
        for (int i = 0; i < 16; i++) {
            long a=n&((int)Math.pow(2,i));
            long b=n&((int)Math.pow(2,31-i));
            if ((a==(int)Math.pow(2,i))&&b==0) {
                n-=a;
                n+=((int) Math.pow(2,31-i));
            }else if(a==0&&(b==(int)Math.pow(2,31-i))){
                n-=b;
                n+=((int)Math.pow(2,i));
            }
        }
        return n;
    }
}
