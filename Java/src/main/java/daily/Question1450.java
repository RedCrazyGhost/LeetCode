package daily;

/**
 * 1450. 在既定时间做作业的学生人数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/03 12:52
 **/
public class Question1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int sum=0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i]<=queryTime&&queryTime<=endTime[i]){
                sum+=1;
            }
        }
        return sum;
    }
}
