package competition.Competition1;

import java.util.*;

/**
 * 2192. 有向无环图中一个节点的所有祖先
 *
 * @author wenxingzhan
 * @date 2022/03/09 10:47
 **/
public class Question2192 {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
//       hash表+DFS 超出内存限制
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            map.put(i,new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            List<Integer> list = map.get(edges[i][1]);
            list.add(edges[i][0]);
            map.put(edges[i][1], list);
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> set=new HashSet<>(dfs(i,map));
            list.add(new ArrayList<>(set));
        }
        return list;
    }
    public List<Integer> dfs(int target,Map<Integer,List<Integer>> map){
        List<Integer> list= map.get(target);
        for (int i = 0; i < list.size(); i++) {
            list.addAll(dfs(list.get(i), map));
        }
        return list;
    }
}
