package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 2194. Excel 表中某个范围内的单元格
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/25 17:16
 **/
public class Question2194 {
    public List<String> cellsInRange(String s) {
        List<String>list=new ArrayList<>();
        String[] strs=s.split(":");
        for (char i = strs[0].charAt(0); i <=strs[1].charAt(0) ; i++) {
            for (char j = strs[0].charAt(1); j <= strs[1].charAt(1); j++) {
                list.add(i+""+j);
            }
        }
        return list;
    }
}
