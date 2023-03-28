package 每日一题;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * 面试题 17.09. 第 k 个数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/28 10:02
 **/
public class QuestionInterview1709 {
    //多路归并（多指针）
    public int getKthMagicNumber(int k) {
        int[] arr=new int[k+1];
        arr[1]=1;
        for (int index3=1,index5=1,index7=1,i=2; i <=k ; i++) {
            int num3=arr[index3]*3,num5=arr[index5]*5,num7=arr[index7]*7;
            int min=Math.min(num3,Math.min(num5,num7));
            if (num3==min) index3+=1;
            if (num5==min) index5+=1;
            if (num7==min) index7+=1;
            arr[i]=min;
        }
        return arr[k];
    }

//  最小根堆
//    public int getKthMagicNumber(int k) {
//        int[] arr=new int[]{3,5,7};
//        PriorityQueue<Long> queue=new PriorityQueue<>();
//        Set<Long>set=new HashSet<>();
//        queue.add(1L);
//        set.add(1L);
//        while(!queue.isEmpty()){
//            long num= queue.poll();
//            if (--k==0)return (int)num;
//            for(int i:arr){
//                if (!set.contains(i*num)){
//                    queue.add(i*num);
//                    set.add(i*num);
//                }
//            }
//        }
//        return -1;
//    }
}
