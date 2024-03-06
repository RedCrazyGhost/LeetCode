package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 1895. 最大的幻方
 *
 * @author wenxingzhan
 * @date 2021/11/17 20:40
 **/
public class Question1895 {
    public int largestMagicSquare(int[][] grid) {
        for (int k = Math.min(grid.length,grid[0].length); k >0; k--) {
            for (int i = 0; i < grid.length -k+1; i++) {
                for (int j = 0; j < grid[0].length - k+1; j++) {
                    if(isMagic(i,j,k,grid)){
                        return k;
                    }
                }
            }
        }
        return 1;
    }
    public boolean isMagic(int y,int x,int l,int[][] grid){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = y; i < y+l; i++) {
            int sum0=0;
            for (int j = x; j <x+l; j++) {
                sum0+=grid[i][j];
            }
            map.put(sum0,map.getOrDefault(sum0,0)+1);
        }


        for (int i = x; i < x+l; i++) {
            int sum1=0;
            for (int j = y; j < y+l; j++) {
                sum1+=grid[j][i];
            }
            map.put(sum1,map.getOrDefault(sum1,0)+1);
        }

        int sum0=0,sum1=0;
        for (int i = 0; i < l; i++) {
            sum0+=grid[y+i][x+i];
            sum1+=grid[y+i][x+l-i-1];
        }
        map.put(sum0,map.getOrDefault(sum0,0)+1);
        map.put(sum1,map.getOrDefault(sum1,0)+1);

        if(map.keySet().size()>1){
            return false;
        }else{
            return true;
        }
    }
}
