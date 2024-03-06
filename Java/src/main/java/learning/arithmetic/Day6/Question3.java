package learning.算法入门.Day6;

/**
 * 3. 无重复字符的最长子串
 *
 * @author wenxingzhan
 * @date 2021/12/31 14:19
 **/
public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        char[] chars=s.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i==0||stringBuilder.length()==0){
                stringBuilder.append(chars[i]);
            }else{
                for (int j = 0; j < stringBuilder.length(); j++) {
                    if(stringBuilder.charAt(j)==chars[i]){
                       max=Math.max(max, stringBuilder.length());
                        stringBuilder.delete(0,j+1);
                        break;
                    }
                }
                stringBuilder.append(chars[i]);

            }
        }
        return Math.max(max, stringBuilder.length());
    }
}
