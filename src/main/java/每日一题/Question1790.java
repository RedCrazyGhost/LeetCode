package 每日一题;

/**
 * 1790. 仅执行一次字符串交换能否使两个字符串相等
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/11 09:24
 **/
public class Question1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        char[][] chars=new char[2][2];
        int index=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                if (index>=2){
                    return false;
                }
                chars[index][0]= s1.charAt(i);
                chars[index++][1]= s2.charAt(i);
            }
        }
        if (chars[0][0]==chars[1][1]&&chars[0][1]==chars[1][0]) {
            return true;
        }else{
            return false;
        }
    }
}
