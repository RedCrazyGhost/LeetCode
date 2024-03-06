package learning.数据结构基础.Day19;

import java.util.ArrayList;
import java.util.List;

/**
 * 1557. 可以到达所有点的最少点数目
 *
 * @author wenxingzhan
 * @date 2022/01/25 17:06
 **/
public class Question1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] arr=new boolean[n];
        for(List<Integer> list:edges){
            arr[list.get(1)]=true;
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]){
                list.add(i);
            }
        }
        return list;
    }
}
