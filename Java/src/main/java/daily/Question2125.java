package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2125. 银行中的激光束数量
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/03 12:55
 **/
public class Question2125 {
    public int numberOfBeams(String[] bank) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <bank.length ; i++) {
            int num=0;
            for(char c:bank[i].toCharArray()){
                if (c=='1'){
                    num+=1;
                }
            }
            if (num!=0) {
                list.add(num);
            }
        }
        int sum=0;
        for (int i = 0; i < list.size()-1; i++) {

            sum+=list.get(i)* list.get(i+1);
        }
        return sum;
    }
}
