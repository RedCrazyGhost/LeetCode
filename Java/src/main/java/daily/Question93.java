package daily;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 93. 复原 IP 地址
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/24 13:25
 **/
public class Question93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        if (s.length()>=4&&s.length()<=12) {
            StringBuilder stringBuilder = new StringBuilder(s);
            for (int i = 1; i <= 3; i++) {
                int min = Math.min(i, s.length());
                stringBuilder.insert(min, '.');
                for (int j = 1; j <= 3; j++) {
                    int min1 = Math.min(i + j + 1, s.length() + 1);
                    stringBuilder.insert(min1, '.');
                    for (int k = 1; k <= 3; k++) {
                        int min2 = Math.min(k + i + j + 2, s.length() + 2);
                        stringBuilder.insert(min2, '.');

                        if (isIP(stringBuilder.toString())) {
                            list.add(stringBuilder.toString());
                        }
                        stringBuilder.deleteCharAt(min2);
                    }
                    stringBuilder.deleteCharAt(min1);
                }
                stringBuilder.deleteCharAt(min);
            }
        }

        return list;
    }

    public boolean isIP (String str){
        String[] strings=str.split("\\.");
        if (strings.length!=4) {
           return false;
        }else{
            for (String s : strings) {
                if (s.length() < 1) {
                    return false;
                } else {
                    if (s.charAt(0) == '0' && s.length() != 1) {
                        return false;
                    } else {

                        long num = Long.parseLong(s);
                        if (num < 0 || num > 255) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
