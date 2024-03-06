package competition.Competition5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 跑步锻炼
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/21 19:41
 **/
public class QuestionC {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2000, 1, 1).until(LocalDate.of(2020, 10, 1), ChronoUnit.DAYS));
        LocalDate date =LocalDate.of(2000, 1, 1);
        int sum=0;
        for (int i = 0; i <= 7579; i++) {
            if (date.getDayOfWeek().getValue()==1||date.getDayOfMonth()==1){
                sum+=1;
            }
            sum+=1;
            date=date.plusDays(1);
        }
        System.out.println(sum);

//      ✅  结果：8879 km
    }
}
