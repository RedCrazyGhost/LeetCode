package 每日一题;

/**
 * 1252. 奇数值单元格的数目
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/07/12 10:10
 **/
public class Question1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int num=0;
        int[] row=new int[m];
        int[] col=new int[n];
        for (int[] index:indices) {
            row[index[0]]+=1;
            col[index[1]]+=1;
        }
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if ((row[i]+col[j])%2==1){
                    num+=1;
                }
            }
        }
        return num;
    }
}
