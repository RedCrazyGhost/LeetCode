package 每日一题;

import java.util.*;

/**
 * 658. 找到 K 个最接近的元素
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/08/25 22:57
 **/
public class Question658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Integer> queue=new ArrayDeque<>(k);
        int queuenumber=0;
        for(int i:arr){
            if (queuenumber<k){
                queue.add(i);
                queuenumber++;
            }else{
                int num=Math.abs(queue.peek()-x)-Math.abs(i-x);


                if (num>0){
                    queue.remove();
                    queue.add(i);
                } else if (num==0) {
                    if (queue.peek()>i){
                        queue.remove();
                        queue.add(i);
                    }
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
