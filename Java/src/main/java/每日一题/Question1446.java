package 每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * 1446.连续字符串
 *
 * @author wenxingzhan
 * @date 2021/12/01 08:51
 **/
public class Question1446 {
    public int maxPower(String s) {
        int max=0;
        int index0=0,index1=index0+1;
        if (s.length()==1){
            return 1;
        }

        while(index0<s.length()-1){

            while(index1<s.length()){
                if (s.charAt(index0)!=s.charAt(index1)){
                    break;
                }
                index1+=1;
            }
            max=Math.max(max,index1-index0);
            index0=index1;
            index1=index0+1;
            if (max>s.length()-index0){
                break;
            }
        }
        return max;
    }
}
