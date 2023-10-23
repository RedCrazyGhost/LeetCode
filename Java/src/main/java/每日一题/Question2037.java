package 每日一题;

import java.util.Arrays;

/**
 * 2037. 使每位学生都有座位的最少移动次数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/31 18:37
 **/
public class Question2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for (int i = 0; i < seats.length; i++) {
            sum+=Math.abs(seats[i]-students[i]);
        }

        return sum;

    }
}
