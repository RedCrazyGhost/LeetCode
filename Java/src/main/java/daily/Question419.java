package daily;

/**
 * 419. 甲板上的战舰
 *
 * @author wenxingzhan
 * @date 2021/12/18 13:19
 **/
public class Question419 {
    int h;
    int w;
    char[][] board;
    public int countBattleships(char[][] board) {
        this.h=board.length;
        this.w=board[0].length;
        this.board=board;
        int num=0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j]=='X'){
                    isFlag(i,j);
                    num+=1;
                }
            }
        }
        return num;
    }
    private void isFlag(int y,int x) {
        board[y][x]='.';
                if (y==0&&y<h-1){
                    if (board[y + 1][x] == 'X'){
                        isFlag(y + 1,x);
                    }
                }else if (y==h-1&&y>0){
                    if (board[y - 1][x] == 'X'){
                        isFlag(y - 1,x);
                    }
                }else if (y<h-1&&y>0){
                    if (board[y + 1][x] == 'X' || board[y - 1][x] == 'X') {
                        isFlag(y + 1,x);
                    }
                }


            if (x==0&&x<w-1){
                if (board[y][x+ 1] == 'X'){
                    isFlag(y ,x+1);

                }
            }else if (x==w-1&&x>0){
                if (board[y][x-1] == 'X'){
                    isFlag(y ,x-1);

                }
            }else if (x<w-1&&x>0){
                if (board[y][x + 1] == 'X' || board[y][x - 1] == 'X') {
                    isFlag(y,x+1);
                }
            }
        }
    }
