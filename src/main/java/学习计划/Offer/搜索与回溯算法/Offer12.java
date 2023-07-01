package 学习计划.Offer.搜索与回溯算法;

/**
 * 剑指 Offer 12. 矩阵中的路径
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/01 16:49
 **/
public class Offer12 {
    int[][] option=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    char[] chars;
    public boolean exist(char[][] board, String word) {
        boolean[][] record=new boolean[board.length][board[0].length];
        chars=word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int cIndex=0;
                if (board[i][j]==chars[cIndex]){
                    if(dfs(j,i,cIndex,record,board)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(int x,int y,int cIndex,boolean[][] record,char[][] board){
        if ((y>=0&&y< board.length )&&(x>=0&&x<board[0].length)&& chars[cIndex]==board[y][x] && !record[y][x]){
            record[y][x]=true;
            if (cIndex== chars.length-1){
                return true;
            }
        }else{
            return false;
        }
        boolean flag=false;


        for (int[] ints : option) {
            flag = flag || dfs(x + ints[0], y + ints[1], cIndex + 1, record, board);
        }
        record[y][x]=false;
        return flag;
    }
}
