package learning.Offer.排序;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 41. 数据流中的中位数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/07 15:07
 **/
public class Offer41 {
    List<Integer> list;
    public Offer41() {
        list=new ArrayList<>();
    }

    public void addNum(int num) {
        list.add(num);
        list.sort(Integer::compareTo);
    }

    public double findMedian() {
        if (list.size()%2==0){
            return (double) (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) /2;
        }else{
            return list.get(list.size()/2);
        }
    }
}
