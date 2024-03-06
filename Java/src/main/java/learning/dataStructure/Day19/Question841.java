package learning.数据结构基础.Day19;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 841. 钥匙和房间
 *
 * @author wenxingzhan
 * @date 2022/01/25 17:27
 **/
public class Question841 {
    boolean[] arr;
    int num;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        num=0;
        arr=new boolean[n];
        dfs(rooms,num);
       return num==n;
    }
    public void dfs(List<List<Integer>> rooms,int x){
        arr[x]=true;
        num++;
        for (int i:rooms.get(x)) {
            if (!arr[i]){
                dfs(rooms, i);
            }
        }
    }
}
