package competition.Competition7;

import java.time.LocalDate;

/**
 * 试题 A: 星期计算
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/10 11:02
 **/
public class QuestionA {
    public void methode(){
        int nowDay=6,addDay=(int)Math.pow(20,22)%7;

        System.out.println("使用LocalDate计算结果 : "+LocalDate.of(2022, 4, 9).plusDays((int) Math.pow(20, 22)).getDayOfWeek().getValue());

        System.out.println("使用取余计算结果 : "+((nowDay + addDay) % 7 == 0 ? 7 : (nowDay + addDay) % 7));
    }
}
