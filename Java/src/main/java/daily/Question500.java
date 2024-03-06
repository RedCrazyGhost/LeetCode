package daily;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Question500 {
    public String[] findWords(String[] words) {
        String[] arr = new String[0];
        List<String>list =new ArrayList<>();
        for(int i=0;i< words.length;i++) {
            if (Pattern.matches("[qwertyuiopQWERTYUIOP]*", words[i])) {
                list.add(words[i]);
            }
            if (Pattern.matches("[asdfghjklASDFGHJKL]*", words[i])) {
                list.add(words[i]);
            }
            if (Pattern.matches("[zxcvbnmZXCVBNM]*", words[i])) {
                list.add(words[i]);
            }
        }
       
        return list.toArray(arr);
    }
}
