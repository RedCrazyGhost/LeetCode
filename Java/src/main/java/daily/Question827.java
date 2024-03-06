package daily;

import java.util.*;

/**
 * 827. 最大人工岛
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/18 11:11
 **/
public class Question827 {
//    标记岛屿+合并
    public int largestIsland(int[][] grid) {
        int mapSizeMax=0;
        Map<Integer,Integer> map=new HashMap<>();
        int[][] mapArr=new int[grid.length][grid[0].length];
        int mapNumber=1;
        Queue<Integer> queue=new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (mapArr[i][j]==0&&grid[i][j]==1){
                    queue.add(i*grid[0].length+j);
                    mapArr[i][j]=mapNumber;
                    int mapSize=0;
                    while(!queue.isEmpty()){
                        mapSize+=1;
                        int num=queue.poll();
                        int x=num%grid[0].length;
                        int y=num/grid[0].length;

                        if (x<grid[0].length-1&&mapArr[y][x+1]==0&&grid[y][x+1]==1){
                            queue.add(y*grid[0].length+x+1);
                            mapArr[y][x+1]=mapNumber;
                        }
                        if (0<x&&mapArr[y][x-1]==0&&grid[y][x-1]==1){
                            queue.add(y*grid[0].length+x-1);
                            mapArr[y][x-1]=mapNumber;
                        }
                        if (y<grid.length-1&&mapArr[y+1][x]==0&&grid[y+1][x]==1){
                            queue.add((y+1)*grid[0].length+x);
                            mapArr[y+1][x]=mapNumber;
                        }
                        if (0<y&&mapArr[y-1][x]==0&&grid[y-1][x]==1){
                            queue.add((y-1)*grid[0].length+x);
                            mapArr[y-1][x]=mapNumber;
                        }
                    }
                    mapSizeMax=Math.max(mapSize,mapSizeMax);
                    map.put(mapNumber,mapSize);
                    mapNumber+=1;
                }
            }
        }


        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (mapArr[y][x]==0&&grid[y][x]==0){
                    int mapSize=1;
                    Set<Integer> set=new HashSet<>();
                    if (x<grid[0].length-1&&mapArr[y][x+1]!=0&&grid[y][x+1]==1){
                        set.add(mapArr[y][x+1]);
                    }
                    if (0<x&&mapArr[y][x-1]!=0&&grid[y][x-1]==1){
                        set.add(mapArr[y][x-1]);
                    }
                    if (y<grid.length-1&&mapArr[y+1][x]!=0&&grid[y+1][x]==1){
                        set.add(mapArr[y+1][x]);
                    }
                    if (0<y&&mapArr[y-1][x]!=0&&grid[y-1][x]==1){
                        set.add(mapArr[y-1][x]);
                    }
                    for (int item:set) {
                        mapSize+=map.get(item);
                    }
                    mapSizeMax=Math.max(mapSizeMax,mapSize);
                }
            }
        }
        return mapSizeMax;

    }
//    BFS 暴力
//    public int largestIsland(int[][] grid) {
//        int max=0;
//        int[][] arr=new int[grid.length][grid[0].length];
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                Queue<Integer> queue=new ArrayDeque<>();
//                queue.add(i*grid[0].length+j);
//                arr[i][j]=1;
//                int mapsize=0;
//                while(!queue.isEmpty()){
//                    mapsize+=1;
//                    int num=queue.poll();
//                    int x=num%grid[0].length;
//                    int y=num/grid[0].length;
//
//                        if (x<grid[0].length-1&&arr[y][x+1]==0&&grid[y][x+1]==1){
//                            queue.add(y*grid[0].length+x+1);
//                            arr[y][x+1]=1;
//                        }
//                        if (0<x&&arr[y][x-1]==0&&grid[y][x-1]==1){
//                            queue.add(y*grid[0].length+x-1);
//                            arr[y][x-1]=1;
//                        }
//                        if (y<grid.length-1&&arr[y+1][x]==0&&grid[y+1][x]==1){
//                            queue.add((y+1)*grid[0].length+x);
//                            arr[y+1][x]=1;
//                        }
//                        if (0<y&&arr[y-1][x]==0&&grid[y-1][x]==1){
//                            queue.add((y-1)*grid[0].length+x);
//                            arr[y-1][x]=1;
//                        }
//
//                }
//                max=Math.max(max,mapsize);
//                for (int k = 0; k < grid.length; k++) {
//                    Arrays.fill(arr[k],0);
//                }
//            }
//        }
//        return max;
//    }
}
