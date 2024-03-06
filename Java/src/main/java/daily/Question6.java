package daily;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 6. Z 字形变换
 *
 * @author wenxingzhan
 * @date 2021/11/04 13:30
 **/
public class Question6 {
    public String convert(String s, int numRows) {
//        if (numRows == 1) return s;
//        StringBuilder sb = new StringBuilder();
//        int n = s.length();
//        int cycleLen = 2 * numRows - 2;
//
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j + i < n; j += cycleLen) {
//                sb.append(s.charAt(j + i));
//                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
//                    sb.append(s.charAt(j + cycleLen - i));
//            }
//        }
//        return sb.toString();

//        Map<Integer,ArrayList<Character>> map=new HashMap<>();
//        int row=numRows;
//        boolean flag=true;
//        for (int i = 0; i < s.length(); i++) {
//            map.computeIfAbsent(numRows - row, k -> new ArrayList<>());
//            map.get(numRows - row).add(s.charAt(i));
//            if (flag){
//                row--;
//                if (row==1){
//                    flag=false;
//                }
//            }else{
//                row++;
//                if (row==numRows){
//                    flag=true;
//                }
//            }
//        }
//        StringBuilder stringBuilder=new StringBuilder();
//        for(ArrayList<Character> listc:map.values()){
//            stringBuilder.append(listc.stream()
//                    .map(String::valueOf)
//                    .collect(Collectors.joining()));
//        }
//        return stringBuilder.toString();

//        时间最优解！
        char[] chars=s.toCharArray();
        int len=chars.length;
        char[] newChars=new char[len];
        int index=0,num=numRows!=1?2*numRows-2:1;
        for (int i = 0; i < numRows; i++) {

            if (i==0||i==numRows-1){
                for (int j = i; j <len ; j+=num) {
                    newChars[index++]=chars[j];
                }
            }else{
                int j=i;
                while(j<len){
                    newChars[index++]=chars[j];
                    if (j%num==i){
                        j+=num-2*i;
                    }else{
                        j+=2*i;
                    }
                }
            }
        }
        return new String(newChars);
    }
}
