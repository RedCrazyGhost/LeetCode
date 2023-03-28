package 学习计划.数据结构基础.Day3;

/**
 * 59. 螺旋矩阵 II
 *
 * @author wenxingzhan
 * @date 2022/01/12 10:33
 **/
public class Question59 {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];

        int y=0, x=0,i=n;
        int num=0;
        while(i>0) {
//        右
            for (;num<n*n&& x < i ; x++) {
                arr[y][x] = ++num;
            }
            x -= 1;
            y += 1;
//        下
            for (; num<n*n&&y < i; y++) {
                arr[y][x] = ++num;
            }
            y -= 1;
            x -= 1;
//        左
            for (;num<n*n&& x > n-i-1; x--) {
                arr[y][x] = ++num;
            }
            x += 1;
            y -= 1;
//        上
            for (;num<n*n&& y > n-i; y--) {
                arr[y][x] = ++num;
            }
            x+=1;
            y += 1;
            i-=1;
        }

            
        return arr;
    }
}
