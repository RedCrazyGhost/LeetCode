package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 788. 旋转数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/25 11:29
 **/
public class Question788 {
    // 0,1,2,5,6,8,9    3,4,7
    public int rotatedDigits(int n) {
        int num=0;
        top:for (int i = 1; i <= n; i++) {
            String str=String.valueOf(i);
            boolean flag=false;
            for (int j = 0; j < str.length(); j++) {
                switch (str.charAt(j)){
                    case '1','0','8':
                        break;
                    case '2','5','6','9':
                        flag=true;
                        break;
                    default:
                        continue top;
                }
            }
            if (flag){
                num+=1;
            }
        }
        return num;
    }
}
