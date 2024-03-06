package daily;

import java.util.*;

/**
 * 2336. 无限集中的最小数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/11/29 20:44
 **/
public class Question2336 {

    private int count;
    private TreeSet<Integer> set;

    public void SmallestInfiniteSet() {
        count=1;
        set=new TreeSet<>();
    }

    public int popSmallest() {
        if (set.isEmpty()){
            return count++;
        }
        return set.pollFirst();

    }

    public void addBack(int num) {
        if (num < count){
            set.add(num);
        }
    }
}
