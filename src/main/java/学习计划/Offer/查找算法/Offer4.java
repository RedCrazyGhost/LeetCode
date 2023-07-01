package 学习计划.Offer.查找算法;

/**
 * 剑指 Offer 04. 二维数组中的查找
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/28 17:13
 **/
public class Offer4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=matrix.length - 1,j=0;
        while(i>=0&&j<matrix[0].length){
            if (matrix[i][j]>target){
                i--;
            } else if (matrix[i][j]<target) {
                j++;
            }else{
                return true;
            }
        }
        return false;
    }
}
