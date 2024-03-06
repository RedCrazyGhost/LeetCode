package learning.数据结构基础.Day9;

/**
 * 5. 最长回文子串
 *
 * @author wenxingzhan
 * @date 2022/01/14 00:22
 **/
public class Question5 {
    public String longestPalindrome(String s) {
//       中心扩展
        char[] chars=s.toCharArray();
        String str="";
        if (s.length()==1){
            str=s;
        }else {
            for (int i = 0; i < chars.length; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(chars[i]);
                for (int j = 1;j <= Math.min(i, chars.length - 1 - i); j++) {
                    if (chars[i + j] == chars[i - j]) {
                        stringBuilder.insert(0, chars[i - j]);
                        stringBuilder.append(chars[i + j]);
                    } else {
                        break;
                    }
                }
                if (str.length() < stringBuilder.length()) {
                    str = stringBuilder.toString();
                }
                for (int j = 0; j <= Math.min(i, chars.length - 2 - i); j++) {
                    if (chars[i - j] == chars[i + j + 1]) {
                        if (stringBuilder.length() % 2 == 1) {
                            stringBuilder.delete(0,stringBuilder.length());
                        }
                        stringBuilder.insert(0, chars[i - j]);
                        stringBuilder.append(chars[i - j]);
                    } else {
                        break;
                    }
                }
                if (str.length() < stringBuilder.length()) {
                    str = stringBuilder.toString();
                }
            }
        }
        return  str;
    }
}
