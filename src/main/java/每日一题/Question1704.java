package 每日一题;

/**
 * 1704. 判断字符串的两半是否相似
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/11/11 22:14
 **/
public class Question1704 {
    public boolean halvesAreAlike(String s) {
        int num=0,iLen=s.length()/2;
        for (int i = 0; i < iLen; i++) {
            if(isVowel(s.charAt(i)))num+=1;
            if(isVowel(s.charAt(i+iLen)))num-=1;
        }
        return num==0?true:false;
    }
    private boolean isVowel(char c){
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')return true;
        return false;
    }
}
