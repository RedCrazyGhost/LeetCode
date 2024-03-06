package learning.Offer.模拟;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/12 17:38
 **/
public class Offer29 {
    public int[] spiralOrder(int[][] matrix) {

        int y=matrix.length;
        if (y==0){
            return new int[0];
        }
        int x=matrix[0].length;
        int indexMY=0,indexMX=0,indexA=0;
        int len=y*x;
        int[] arr=new int[len];
        int  turnsNum=0;

        while(indexA<len) {
            if (turnsNum!=0){
                indexMY+=1;
                indexMX+=1;
            }
            //➡️
            for (; indexA<len&&indexMX < x-turnsNum; indexMX++) {
                arr[indexA++] = matrix[indexMY][indexMX];
            }

            //⬇️
            indexMY += 1;
            indexMX -= 1;
            for (; indexA<len&&indexMY < y-turnsNum; indexMY++) {
                arr[indexA++] = matrix[indexMY][indexMX];
            }

            //⬅️
            indexMY -= 1;
            indexMX -= 1;
            for (; indexA<len&&-1+turnsNum < indexMX; indexMX--) {
                arr[indexA++] = matrix[indexMY][indexMX];
            }

            //⬆️
            indexMY -= 1;
            indexMX += 1;
            for (; indexA<len&&turnsNum < indexMY; indexMY--) {
                arr[indexA++] = matrix[indexMY][indexMX];
            }
            turnsNum++;
        }
        return arr;
    }
}
//        RunQuestion(Offer29.class, (Object) new int[][]{{1,2,3},{8,9,4},{7,6,5}});
//        RunQuestion(Offer29.class, (Object) new int[][]{{1,2,3},{6,5,4}});
//        RunQuestion(Offer29.class, (Object) new int[][]{
//                {1,2,3,4},
//                {10,11,12,5},
//                {9,8,7,6},
//        });
//        RunQuestion(Offer29.class, (Object) new int[0][0]);
