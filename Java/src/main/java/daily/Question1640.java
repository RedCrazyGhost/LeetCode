package daily;

/**
 * 1640. 能否连接形成数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/22 19:45
 **/
public class Question1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int arrIndex=0,piecesIndex=0,count=0;


        while(piecesIndex>=0){
            for (int j = 0; j < pieces[piecesIndex].length; j++) {
                if (pieces[piecesIndex][j]==arr[arrIndex]){
                    arrIndex+=1;
                    count=0;
                }else{
                    count+=1;
                    break;
                }
            }
            if (arrIndex== arr.length){
                return true;
            }
            if (count==pieces.length){
                break;
            }
            piecesIndex=(piecesIndex+1)%pieces.length;
        }
        return false;
    }
}
