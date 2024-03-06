package daily;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 833. 字符串中的查找与替换
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/15 01:37
 **/
public class Question833 {

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        Object[][] arr=new Object[indices.length][3];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=indices[i];
            arr[i][1]=sources[i];
            arr[i][2]=targets[i];
        }
        Arrays.sort(arr, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                return (int)o1[0]-(int)o2[0];
            }
        });


        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0,j=0; i <s.length() ; i++) {

            if (j<arr.length&&i==(int)arr[j][0]){
                if (s.startsWith((String)arr[j][1], (int)arr[j][0])) {
                    stringBuilder.append(arr[j][2]);
                    i += (((String) arr[j][1]).length()) - 1;
                }else{
                    stringBuilder.append(s.charAt(i));
                }
                j++;
            } else{
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
