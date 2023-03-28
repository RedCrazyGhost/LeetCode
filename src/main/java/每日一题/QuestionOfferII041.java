package 每日一题;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 剑指 Offer II 041. 滑动窗口的平均值
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/07/16 13:08
 **/
public class QuestionOfferII041 {
    int[] arr=null;
    int index=0,size=0;
    double sum=0;
    public QuestionOfferII041(int size) {
        arr=new int[size];
        this.size=size;
    }

    public double next(int val) {
        int first = index / size;
        int count= index % size;
        if (first == 0) {
            sum += val;
            arr[count] = val;
            index+=1;
            return sum / (count + 1);
        } else {
            sum -= arr[count];
            arr[count] = val;
            sum += val;
            index+=1;
            return sum / size;
        }

    }
}
