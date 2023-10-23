package 每日一题;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 937. 重新排列日志文件
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/03 16:08
 **/
public class Question937 {
    public String[] reorderLogFiles(String[] logs) {
        List<String> list=new ArrayList<>();
        for (String str: logs){
            list.add(str);
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] strings1=o1.split(" ");
                String[] strings2=o2.split(" ");

                int numlog1=strings1[1].matches("[0-9]+")?1:0;
                int numlog2=strings2[1].matches("[0-9]+")?1:0;

                int tonum=numlog1-numlog2;
                if (tonum!=0){
                    return tonum;
                }else{
                    if (numlog1==1){
                        return 0;
                    }else{
                            for (int i = 1; i < Math.min(strings1.length, strings2.length); i++) {
                                if (!strings1[i].equals(strings2[i])){
                                    for (int j = 0; j < Math.min(strings1[i].length(),strings2[i].length()); j++) {
                                        if (strings1[i].charAt(j)!=strings2[i].charAt(j)) {
                                            int charnum=strings1[i].charAt(j) - strings2[i].charAt(j);
                                            if (charnum>0){
                                                return 1;
                                            } else if (charnum<0) {
                                                return -1;
                                            }
                                        }
                                    }
                                    if (strings1[i].length()-strings2[i].length()>0){
                                        return 1;
                                    }else if (strings1[i].length()-strings2[i].length()<0){
                                        return -1;
                                    }
                                }
                            }
                            if (strings1.length-strings2.length>0){
                                return 1;
                            }else if (strings1.length-strings2.length<0){
                                return -1;
                            }
                            for (int j = 0; j < Math.min(strings1[0].length(),strings2[0].length()); j++) {
                                if (strings1[0].charAt(j)!=strings2[0].charAt(j)) {
                                    int charnum=strings1[0].charAt(j) - strings2[0].charAt(j);
                                    if (charnum>0){
                                        return 1;
                                    } else if (charnum<0) {
                                        return -1;
                                    }
                                }
                            }
                            if (strings1[0].length()-strings2[0].length()>0){
                                return 1;
                            }else if (strings1[0].length()-strings2[0].length()<0){
                                return -1;
                            }
                        }
                    }
                return 0;
            }
        });
        return list.toArray(new String[0]);
    }
}
