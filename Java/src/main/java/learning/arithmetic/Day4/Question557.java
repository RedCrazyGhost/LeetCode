package learning.算法入门.Day4;

/**
 * 557. 反转字符串中的单词 III
 *
 * @author wenxingzhan
 * @date 2021/12/28 12:55
 **/
public class Question557 {
    public String reverseWords(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        String[] strings=s.split(" ");
        for (int i = 0; i <strings.length ; i++) {
            stringBuilder.append(reverseString(strings[i].toCharArray()));
            if (i!=strings.length-1){
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
    public char[] reverseString(char[] s) {
        for (int i = 0,j=s.length-1; i < s.length/2 ; i++,j--) {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        return s;
    }
}
