package 每日一题;

/**
 * 461. 汉明距离
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/01 21:12
 **/
public class Question461 {
    public int hammingDistance(int x, int y) {
//        todo 汉明距离原理不清楚
        int max=0,min=0;
       if (x>y){
           max=x;
           min=y;
       }else{
           max=y;
           min=x;
       }
       int num=0;
       while(max!=min){
           max>>=1;
           num+=1;
       }
       return num;
    }
}
