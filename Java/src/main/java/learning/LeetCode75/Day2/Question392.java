package learning.LeetCode75.Day2;

/**
 * 392. 判断子序列
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/28 17:00
 **/
public class Question392 {
    /**
     * 判断s是否为t的子序列
     * 例如，"ace"是"abcde"的一个子序列，而"aec"不是
     * 思考：考虑双指针循环一次t
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0){
            return true;
        }
        int len = t.length();
        if (len==0){
            return false;
        }
        int indexS=0,indexT=0;
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        for (int i = 0; i < len; i++) {
            if (charsS[indexS]==charsT[i]){
                indexS+=1;
            }
            if (indexS==s.length()){
                return true;
            }
        }
        return false;
    }


    public void TestCase(){
        System.out.println(isSubsequence("b", "abc"));
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("abc", "ahbgd"));
        System.out.println(isSubsequence("", ""));
        System.out.println(isSubsequence("a", ""));
        System.out.println(isSubsequence("", "a"));
    }
}
