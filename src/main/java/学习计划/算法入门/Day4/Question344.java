package 学习计划.算法入门.Day4;

/**
 * 344. 反转字符串
 *
 * @author wenxingzhan
 * @date 2021/12/28 12:51
 **/
public class Question344 {
    public void reverseString(char[] s) {
        for (int i = 0,j=s.length-1; i < s.length/2 ; i++,j--) {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
