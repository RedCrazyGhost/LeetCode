package 每日一题;

import java.util.*;

/**
 * 886. 可能的二分法
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/16 09:23
 **/
public class Question886 {
    //官方BFS
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] arr=new int[n];
        Arrays.sort(dislikes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
        for(int[] d:dislikes){
            if (arr[d[0]-1]==arr[d[1]-1]){
                if (arr[d[0]-1]==0){
                    arr[d[0]-1]=1;
                    arr[d[1]-1]=2;
                }else{
                    System.out.println(Arrays.toString(arr));
                    return false;
                }
            }else{
                if (arr[d[0]-1]==0){
                    arr[d[0]-1]=arr[d[1]-1]==2?1:2;
                } else if (arr[d[1]-1]==0) {
                    arr[d[1]-1]=arr[d[0]-1]==2?1:2;
                }
            }
        }
        return true;
    }
}
