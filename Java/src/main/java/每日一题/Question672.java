package 每日一题;

/**
 * 672. 灯泡开关 Ⅱ
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/15 12:10
 **/
//4种开关组合得出影响周期为6个，n>=3并且presses>=3及其结果都为8
public class Question672 {
    public int flipLights(int n, int presses) {
        //不按开关
        if (presses == 0) {
            return 1;
        }
        //特殊情况处理
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            //特殊情况
            return presses == 1 ? 3 : 4;
        } else {
            //n >= 3
            return presses == 1 ? 4 : presses == 2 ? 7 : 8;
        }
    }
}
