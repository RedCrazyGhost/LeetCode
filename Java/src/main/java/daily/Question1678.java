package daily;

/**
 * 1678. 设计 Goal 解析器
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/17 17:16
 **/
public class Question1678 {
    public String interpret(String command) {
        StringBuilder stringBuilder=new StringBuilder();
        char[] chars=command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='('&&chars[i+1]==')'){
                stringBuilder.append('o');
                i++;
            }if (chars[i]=='('||chars[i]==')'){
                continue;
            }
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
