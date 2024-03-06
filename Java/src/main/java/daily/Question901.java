package daily;

import java.util.*;

/**
 * 901. 股票价格跨度
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/21 11:50
 **/
public class Question901 {
    Deque<int[]> deque;
    int index;
    public Question901() {
       deque=new ArrayDeque<>();
       deque.push(new int[]{-1,Integer.MAX_VALUE});
       index=-1;
    }

    public int next(int price) {
        index+=1;
        while(price>=deque.peek()[1]){
            deque.pop();
        }
        int num= index-deque.peek()[0];
        deque.push(new int[]{index,price});
        return num;
    }
}
