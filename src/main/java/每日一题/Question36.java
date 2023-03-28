package 每日一题;

import java.util.HashSet;
import java.util.Set;


//解答错误 368 / 507

public class Question36 {

    public boolean isValidSudoku(char[][] board) {
        if (
                method0(board)&&
                method1(board)&&
                        method2(board,0,0)&&
                        method2(board,0,3)&&
                        method2(board,0,6)&&
                        method2(board,3,0)&&
                        method2(board,3,3)&&
                        method2(board,3,6)&&
                        method2(board,6,0)&&
                        method2(board,6,3)&&
                        method2(board,6,6)){
            return true;
        }else{
            return false;
        }

    }
    public boolean method0(char[][] board){
        for (int i = 0; i < 9; i++) {
            Set<Character> set=new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.') {
                    if (!set.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean method1(char[][] board){
        for (int i = 0; i < 9; i++) {
            Set<Character> set=new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if(board[j][i]!='.') {
                    if (!set.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean method2(char[][] board,int x,int y){
        Set<Character> set=new HashSet<>();
        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y+3; j++) {
                if(board[i][j]!='.') {
                    if (!set.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
