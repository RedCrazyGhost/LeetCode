package daily;

/**
 * 2652. 倍数求和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/10/17 19:13
 **/
public class Question2652 {
    private int f(int n,int m){
        return (m+n/m*m)*(n/m)/2;
    }
    public int sumOfMultiples(int n) {
        return f(n, 3) + f(n, 5) + f(n, 7) - f(n, 3 * 5) - f(n, 3 * 7) - f(n, 5 * 7) + f(n, 3 * 5 * 7);
    }


//    循环遍历
//    public int sumOfMultiples(int n) {
//        int sum=0;
//        for (int i = 1; i <= n; i++) {
//            if (i%3==0||i%5==0||i%7==0) sum+=i;
//        }
//        return sum;
//    }
}
