package 每日一题;

import java.util.Arrays;

/**
 * 面试题 01.09. 字符串轮转
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/29 09:27
 **/
public class QuestionInterview0109 {
//    模拟
//    public boolean isFlipedString(String s1, String s2) {
//        int m = s1.length(), n = s2.length();
//        if (m != n)  return false;
//        if (n == 0)  return true;
//        for (int i = 0; i < n; i++) {
//            boolean flag = true;
//            for (int j = 0; j < n; j++) {
//                if (s1.charAt((i + j) % n) != s2.charAt(j)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag)  return true;
//        }
//        return false;
//    }

    //底层KMP 马拉车 滑动数组
    public boolean isFlipedString(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

}
