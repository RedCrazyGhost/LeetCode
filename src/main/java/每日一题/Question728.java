package 每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/31 15:35
 **/
public class Question728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        top: for (int i = left; i <= right; i++) {
            char[] chars=String.valueOf(i).toCharArray();
            for (int j = 0; j <chars.length ; j++) {
                if (chars[j]=='0'||i%(chars[j]-'0')!=0){
                    continue top;
                }
            }
            list.add(i);
        }
        return list;
    }
}
