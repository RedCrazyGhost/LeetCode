package 每日一题;

/**
 * 171. Excel 表列序号
 *
 * @author wenxingzhan
 * @date 2021/11/22 18:22
 **/
public class Question171 {
    public int titleToNumber(String columnTitle) {
        char[] chars=columnTitle.toCharArray();
        int num=0;
        for (int i = chars.length-1; i >-1 ; i--) {
            num+=(chars[i]-'A'+1)*(int)(Math.pow(26, chars.length-i-1));
        }
        return num;
    }
}
