package 每日一题;

/**
 * 1768. 交替合并字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/23 10:30
 **/
public class Question1768 {
    public String mergeAlternately(String word1, String word2) {
        char[] chars=new char[word1.length()+word2.length()];
        for (int i = 0,index=0; i < word1.length()||i<word2.length(); i++) {
            if (i<word1.length())chars[index++]=word1.charAt(i);
            if (i<word2.length())chars[index++]=word2.charAt(i);
        }
        return new String(chars);
    }

//    暴力模拟
//    public String mergeAlternately(String word1, String word2) {
//        int len= Math.max(word1.length(), word2.length());
//        StringBuilder stringBuilder=new StringBuilder();
//        for (int i = 0; i < len; i++) {
//            if (i< word1.length()){
//                stringBuilder.append(word1.charAt(i));
//            }else{
//                stringBuilder.append(word2.substring(i));
//                break;
//            }
//            if (i< word2.length()){
//                stringBuilder.append(word2.charAt(i));
//            }else{
//                stringBuilder.append(word1.substring(i+1));
//                break;
//            }
//        }
//        return stringBuilder.toString();
//    }
}
