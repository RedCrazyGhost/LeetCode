package 学习计划.LeetCode75.Day10;

import java.util.ArrayList;
import java.util.List;

/**
 * 509. 斐波那契数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/05 16:34
 **/
public class Question509 {
    public int fib(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<=n;i++){
            if(i==0){
                list.add(0);
            }else if (i==1){
                list.add(1);
            }else{
                list.add(list.get(i-1)+list.get(i-2));
            }
        }
        return list.get(list.size()-1);
    }

    /*
      性能差
      public int fib(int n) {
              if (n==0){
                  return 0;
              }else if (n==1){
                  return 1;
              }else{
                 return fib(n-1)+fib(n-2);
              }
          }
     */
}
