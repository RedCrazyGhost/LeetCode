package daily;

/**
 * 344. 反转字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/07 02:27
 **/
public class Question344 {
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0,j=s.length-1; i < s.length/2; i++,j--) {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
