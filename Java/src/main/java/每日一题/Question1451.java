package 每日一题;

import java.util.*;

/**
 * 1451. 重新排列句子中的单词
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/20 12:58
 **/
public class Question1451 {
    public String arrangeWords(String text) {
        List<String> list = new ArrayList<>(Arrays.asList(text.split(" ")));
        list.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i==0){
                stringBuilder.append(list.get(i).substring(0,1).toUpperCase()+list.get(i).substring(1));
            }else{
                stringBuilder.append(list.get(i).toLowerCase());
            }
            stringBuilder.append(" ");

        }
        return stringBuilder.toString().trim();
    }
}
