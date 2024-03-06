package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078. Bigram 分词
 *
 * @author wenxingzhan
 * @date 2021/12/26 12:40
 **/
public class Question1078 {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list=new ArrayList<>();
       String[] strs= text.split(" ");
        for (int i = 0; i < strs.length-1; i+=1) {
            if(strs[i].equals(first)&&strs[i+1].equals(second)&&i+1!= strs.length-1){
                list.add(strs[i+2]);
            }
        }
        return list.toArray(new String[0]);
    }
}
