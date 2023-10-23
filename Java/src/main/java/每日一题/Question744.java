package 每日一题;

/**
 * 744. 寻找比目标字母大的最小字母
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/03 12:39
 **/
public class Question744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c:letters){
            if (c>target){
                return c;
            }
        }
        return target;
    }
}
