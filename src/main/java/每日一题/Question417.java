package 每日一题;

import java.util.*;

/**
 * 417. 太平洋大西洋水流问题
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/27 19:12
 **/
public class Question417 {
    List<List<Integer>> ans = new ArrayList<>();
    int[][] map;
    boolean[][] ocean, a, p;
    public void dfs(int i, int j) {
        if (ocean[i][j]) return;
        ocean[i][j] = true;
        if (a[i][j] && p[i][j]) ans.add(Arrays.asList(i, j)); // 每个元素能到这都只有一次,没有重复解
        if (i + 1 < map.length && map[i][j] <= map[i + 1][j]) dfs(i + 1, j);
        if (i - 1 >= 0 && map[i][j] <= map[i - 1][j]) dfs(i - 1, j);
        if (j + 1 < map[0].length && map[i][j] <= map[i][j + 1]) dfs(i, j + 1);
        if (j - 1 >= 0 && map[i][j] <= map[i][j - 1]) dfs(i, j - 1);
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        a = new boolean[heights.length][heights[0].length];
        p = new boolean[heights.length][heights[0].length];
        map = heights;
        ocean = a;
        for (int i = 0; i < heights.length; ++i)    dfs(i, 0); // 第0列
        for (int i = 0; i < heights[0].length; ++i) dfs(0, i); // 第0行
        ocean = p;
        for (int i = 0; i < heights.length; ++i)    dfs(i, heights[0].length - 1); // 第n - 1列
        for (int i = 0; i < heights[0].length; ++i) dfs(heights.length - 1, i);    // 第 m 行
        return ans;
    }


// BFS 路径上的没有添加进来
/*
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        Set<List<Integer>> set=new HashSet<>();
        int[] arr={0,0};
        for (int i = 0; i < heights.length; i++) {
            arr[1]=i;
           if (rightdonw(arr,heights)){
               List<Integer> list1=new ArrayList<>();
               list1.add(arr[0]);
               list1.add(arr[1]);
               set.add(list1);
           }
        }
        arr[1]=0;
        for (int i = 1; i < heights[0].length; i++) {
            arr[0]=i;
            if (rightdonw(arr,heights)){
                List<Integer> list1=new ArrayList<>();
                list1.add(arr[0]);
                list1.add(arr[1]);
                set.add(list1);
            }
        }
        arr[0]= heights.length-1;
        for (int i = 1; i < heights[0].length; i++) {
            arr[1]=i;
            if (leftup(arr,heights)){
                List<Integer> list1=new ArrayList<>();
                list1.add(arr[0]);
                list1.add(arr[1]);
                set.add(list1);
            }
        }
        arr[1]= heights[0].length-1;
        for (int i = 1; i < heights.length; i++) {
            arr[0]=i;
            if (leftup(arr,heights)){
                List<Integer> list1=new ArrayList<>();
                list1.add(arr[0]);
                list1.add(arr[1]);
                set.add(list1);
            }
        }
        return new ArrayList<>(set);
    }

    public boolean rightdonw(int[] arr,int[][] heights){
        Queue<int[]> queue=new ArrayDeque<>();
        queue.add(arr);
        while(!queue.isEmpty()){
            int[] origin= queue.poll();
            int y=origin[0];
            int x=origin[1];
            if (y< heights[0].length-1){
                if (heights[y+1][x]<=heights[y][x]){
                    queue.add(new int[]{y+1,x});
                }
            }
            if (x< heights.length-1){
                if (heights[y][x+1]<=heights[y][x]){
                    queue.add(new int[]{y,x+1});
                }
            }
            if (x== heights.length-1||y==heights[0].length-1){
                return true;
            }
        }
        return false;
    }
    public boolean leftup(int[] arr,int[][] heights){
        Queue<int[]> queue=new ArrayDeque<>();
        queue.add(arr);
        while(!queue.isEmpty()){
            int[] origin= queue.poll();
            int y=origin[0];
            int x=origin[1];
            if (y> 0){
                if (heights[y-1][x]<=heights[y][x]){
                    queue.add(new int[]{y-1,x});
                }
            }
            if (x>0){
                if (heights[y][x-1]<=heights[y][x]){
                    queue.add(new int[]{y,x-1});
                }
            }
            if (x== 0||y==0){
                return true;
            }
        }
        return false;
    }
    */
}
