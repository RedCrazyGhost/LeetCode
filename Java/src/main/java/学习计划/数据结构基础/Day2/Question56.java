package 学习计划.数据结构基础.Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 56. 合并区间
 *
 * @author wenxingzhan
 * @date 2021/12/31 13:55
 **/
public class Question56 {
    public int[][] merge(int[][] intervals) {
        int[] arr0=new int[intervals.length];
        int[] arr1=new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            arr0[i]= intervals[i][0];
            arr1[i]= intervals[i][1];
        }

        int index0=1,index1=0;
        List<int[]>list=new ArrayList<>();

        while(index1< intervals.length-1){
            if (arr0[index1+1]<=arr1[index1]){
                index1+=1;
            }else{
                list.add(new int[]{arr0[index0],arr1[index1]});
                index1+=1;
                index0+=index1;
            }
        }

        int[][] arr=new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);
        }


       return arr;
    }
}
