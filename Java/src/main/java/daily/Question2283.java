package daily;

import com.sun.jdi.IntegerValue;

/**
 * 2283. 判断一个数的数字计数是否等于数位的值
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/01/11 12:42
 **/
public class Question2283 {
    public boolean digitCount(String num) {
        char[] chars=num.toCharArray();
        int[] arr=new int[10];
        for (int i = 0; i < chars.length; i++) {
            int n=chars[i]-'0';
            arr[i]+=n;
            arr[n]-=1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
