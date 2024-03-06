package daily;

/**
 * 762. 二进制表示中质数个计算置位
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/05 12:41
 **/
public class Question762 {
    public int countPrimeSetBits(int left, int right) {
        int sum=0;
        for (int i = left; i <= right; i++) {
            int num=i;
            int numsum=0;
            while(num>0){
                if((num&1)==1){
                    numsum+=1;
                }num>>=1;
            }
            switch (numsum){
                case 2:
                case 3:
                case 5:
                case  7:
                case  11:
                case 13:
                case 17:
                case 19:
                case 23:
                case 29:
                case 31:
                    sum+=1;
                    break;
                default:
                    break;
            }
        }
        return sum;
    }
}
