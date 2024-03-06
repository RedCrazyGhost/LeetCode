package learning.LeetCode75.Day10;

/**
 * 70. 爬楼梯
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/05 16:44
 **/
public class Question70 {

    public int climbStairs(int n) {
        int a=1,b=2,temp=0;
        if (n==1){
            return a;
        }else if (n==2){
            return b;
        }else {
            for (int i = 3; i <=n; i++) {
                temp =a;
                a=b;
                b=temp+b;
            }
        }
        return b;
    }


}
