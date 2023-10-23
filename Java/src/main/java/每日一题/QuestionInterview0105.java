package 每日一题;

/**
 * 面试题 01.05. 一次编辑
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/13 11:45
 **/
public class QuestionInterview0105 {
    public boolean oneEditAway(String first, String second) {
        int fLen = first.length(), sLen = second.length();
        if (fLen - sLen == 1) {
            return methode(second, first);
        } else if (sLen - fLen == 1) {
            return methode(first, second);
        } else if (sLen == fLen) {
            boolean flag = false;
            for (int i = 0; i < sLen; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (!flag) {
                        flag = true;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }


    private boolean methode(String str1, String str2) {
        int index1 = 0, index2 = 0;
        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) == str2.charAt(index2)) {
                index1 += 1;
            }
            index2 += 1;
            if (index2 - index1 > 1) {
                return false;
            }
        }
        return true;
    }
}


