package daily;

/**
 * 1812. 判断国际象棋棋盘中一个格子的颜色
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/19 20:30
 **/
public class Question1812 {
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) - 'a') % 2 != (coordinates.charAt(1) - '1') % 2;
    }
}
