package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 1376. 通知所有员工所需的时间
 * 多叉树 层级节点最大耗时
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/01 14:48
 **/
public class Question1376 {
    //超时
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            map.put(i,manager[i]);
        }

        int max=0;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            int num=0;
            int next=entry.getKey();
            while (next!=-1){
               num+= informTime[next];
               next=map.get(next);
            }
            max=Math.max(max,num);
        }
        return max;
    }
}
