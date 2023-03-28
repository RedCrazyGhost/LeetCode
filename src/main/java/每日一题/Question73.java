package 每日一题;

import java.util.ArrayList;
import java.util.List;

public class Question73 {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
        int index=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==0){
                    List<Integer> list1=new ArrayList<>();
                    list1.add(i);
                    list1.add(j);
                    list.add(list1);}
            }
        }
        for (int i=0;i<list.size();i++){
            matrix[list.get(i).get(0)]=new int[matrix[list.get(i).get(0)].length];
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][list.get(i).get(1)]=0;
            }
        }

    }
}
