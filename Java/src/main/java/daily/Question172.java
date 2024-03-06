package daily;

/**
 * 172. 阶乘后的零
 * 尾随0
 * 计算n中的5的因子个数即可得
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/25 16:53
 **/
public class Question172 {
    public int trailingZeroes(int n) {
        int sum=0;
        while(n>=5){
            sum+=n/=5;
        }
        return sum;
    }
}
