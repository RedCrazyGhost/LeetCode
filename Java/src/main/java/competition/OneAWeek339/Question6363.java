package competition.OneAWeek339;

import java.util.ArrayList;
import java.util.List;

/**
 * 6363. 转换二维数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/02 10:55
 **/
public class Question6363 {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] arr=new int[201];
        for (int i : nums) {
            arr[i]+=1;
        }
        List<List<Integer>> list=new ArrayList<>();
        boolean isEmpty=false;
        while (!isEmpty) {
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[i]--;
                    level.add(i);
                }
            }
            if (level.size()!=0) {
                list.add(level);
            }else{
                isEmpty=true;
            }
        }
        return list;
    }
}
