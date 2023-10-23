package 每日一题;

/**
 * 125. 验证回文串
 *
 * @author wenxingzhan
 * @date 2021/11/12 20:00
 **/
public class Question125 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0,right=s.length()-1;
        while(left<=right){
            char char0=s.charAt(left);
            char char1=s.charAt(right);

            if ((char0<'a'||char0>'z')&&(char0<'0'||char0>'9')){
                left++;
                continue;
            }
            if ((char1<'a'||char1>'z')&&(char1<'0'||char1>'9')){
                right--;
                continue;
            }
            if (char1==char0){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
