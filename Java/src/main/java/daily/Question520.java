package daily;

/**
 * 520. 检测大写字母
 *
 * @author wenxingzhan
 * @date 2021/11/13 13:01
 **/
public class Question520 {
    public boolean detectCapitalUse(String word) {
        int num=0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                num++;
            }
        }
        switch (num){
            case 0:
                if (word.length()!=0){
                    return true;
                }
            case 1:
                if (word.charAt(0)>='A'&&word.charAt(0)<='Z'){
                    return true;
                }
            default:
                if (num==word.length()){
                    return true;
                }
        }
        return false;
    }
}
