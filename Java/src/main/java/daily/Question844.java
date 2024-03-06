package daily;

/**
 * 844. 比较含退格的字符串
 *
 * @author wenxingzhan
 * @date 2021/11/11 19:07
 **/
public class Question844 {
    public boolean backspaceCompare(String s, String t) {
        return o(s).equals(o(t));
    }
    public String   o(String str){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='#'){
                if (stringBuilder.length()!=0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
            }else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
