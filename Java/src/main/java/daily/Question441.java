package daily;

/**
 * 441. 排列硬币
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/17 17:23
 **/

public class Question441 {
    public int arrangeCoins(int n) {
//        数学最优解 二元一次
        return (int) ((Math.sqrt((long) 8 * n + 1) - 1) / 2);
//        int i=1;
//        while ((n-=i++)>0){
//        }
//        if (n==0){
//            return i-1;
//        }else{
//            return i-2;
//        }
    }
}
