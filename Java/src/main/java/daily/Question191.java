package daily;

/**
 * 191. 位1的个数
 *
 * @author wenxingzhan
 * @date 2021/12/10 18:21
 **/
public class Question191 {
    public int hammingWeight(int n) {
        int num= n>0?-1:0;
        for (int i = 0; i < 32; i++) {
            int j=(int)Math.pow(2,i);
            if ((n&j)!=0){
                num+=1;
            }
        }
        return num;
    }
}
