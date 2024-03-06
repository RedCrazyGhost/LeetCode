package learning.Offer.字符串;

/**
 * 剑指 Offer 67. 把字符串转换成整数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/05/26 13:19
 *
 *   RunQuestion(Offer67.class,"42");
 *         RunQuestion(Offer67.class,"   -42");
 *         RunQuestion(Offer67.class,"4193 with words");
 *         RunQuestion(Offer67.class,"words and 987");
 *         RunQuestion(Offer67.class,"-91283472332");
 *         RunQuestion(Offer67.class,"91283472332");
 *         RunQuestion(Offer67.class,"-91283-2");
 *         RunQuestion(Offer67.class,"+91283-2");
 *         RunQuestion(Offer67.class,"+");
 *         RunQuestion(Offer67.class,"-");
 *         RunQuestion(Offer67.class,  "0000000000012345678");
 *         RunQuestion(Offer67.class,  "+0000000000012345678");
 *         RunQuestion(Offer67.class,  "-0000000000012345678");
 **/
public class Offer67 {
    public int strToInt(String str) {
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 0, sign = 1, length = str.length();
        if (length == 0) return 0;
        while (str.charAt(i) == ' ')
            if (++i == length) return 0;
        if (str.charAt(i) == '-') sign = -1;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') i++;
        for (int j = i; j < length; j++) {
            if (str.charAt(j) < '0' || str.charAt(j) > '9') break;
            if (res > bndry || res == bndry && str.charAt(j) > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (str.charAt(j) - '0');
        }
        return sign * res;
    }
}