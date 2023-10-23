package 每日一题;

/**
 * 14. 最长公共前缀
 *
 * @author wenxingzhan
 * @date 2021/12/10 17:24
 **/
public class Question14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder=new StringBuilder();
        try {
            for (int i = 0; i % strs.length < strs.length; i++) {
                if (strs[i % strs.length].charAt(i / strs.length) != strs[0].charAt(i / strs.length)) {
                    return stringBuilder.toString();
                }
                if (i % strs.length == strs.length - 1) {
                    stringBuilder.append(strs[0].charAt(i / strs.length));
                }
            }
        }finally {
            return stringBuilder.toString();
        }
    }
}
