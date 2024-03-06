package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2176. 统计数组中相等且可以被整除的数对
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/02 20:18
 **/
public class Question2176 {
    public int countPairs(int[] nums, int k) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list=map.getOrDefault(nums[i],new ArrayList<>());
            if (list.size()!=0){
                for(int j:list){
                    if((j*i)%k==0){
                        num+=1;
                    }
                }
            }
            list.add(i);
            map.put(nums[i],list);
        }

        return num;

    }
}
