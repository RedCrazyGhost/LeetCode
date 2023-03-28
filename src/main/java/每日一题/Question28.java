package 每日一题;

/**
 * 28. 实现 strStr()
 * 滑动数组
 * @author wenxingzhan
 * @date 2021/12/10 16:58
 **/
public class Question28 {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")){
            return 0;
        }
        int index=-1;
        char[] chars=haystack.toCharArray();
        char[] chars1=needle.toCharArray();

       for (int i = 0; i < chars.length-needle.length()+1; i++) {
            for (int j = 0; j < chars1.length; j++) {
               if (chars[i+j]!=chars1[j]){
                   break;
               }
               if (j==chars1.length-1){
                   return i;
               }
            }
        }
        return index;
    }
}
