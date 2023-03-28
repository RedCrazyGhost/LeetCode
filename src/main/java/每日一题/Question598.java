package 每日一题;

import java.util.HashMap;

/**
 * 598. 范围求和 II
 *
 * @author wenxingzhan
 * @date 2021/11/07 11:36
 **/
public class Question598 {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0){
            return m*n;
        }
        int min=1600000000;
        System.out.println(ops.length);

        for (int[] value : ops) {
            min = Math.min(min, value[0] * value[1]);
        }
        System.out.println("操作最小面积"+min);

        int[][] arr=new int[m][n];
        for (int[] op : ops) {
            for (int j = 0; j < op[0]; j++) {
                for (int k = 0; k <op[1]; k++) {
                    arr[j][k]+=1;
                }
            }
        }

        int minx=40000,miny=40000;
        for (int[] op : ops) {
            minx=Math.min(op[0],minx);
            miny=Math.min(op[1],miny);
        }
        System.out.println("最小面积:"+minx*miny);

        int num=0;
      top:  for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==ops.length){
                    num++;
                }else if(j==0){
                    break top;
                }
                continue;
            }
        }

        System.out.println("循环后结果"+num);

        return num;
    }
    public void show(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
