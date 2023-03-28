package 每日一题;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 1154. 一年中的第几天
 *
 * @author wenxingzhan
 * @date 2021/12/21 20:02
 **/
public class Question1154 {
    public int dayOfYear(String date) {
        int day=0;
        String[] strs= date.split("-");
        switch (Integer.parseInt(strs[1])){
            case 1:
                day+=1+Integer.parseInt(strs[2]);                break;

            case 2:
                day+=32+Integer.parseInt(strs[2]);                break;

            case 3:
                day+=60+Integer.parseInt(strs[2]);                break;

            case 4:
                day+=91+Integer.parseInt(strs[2]);                break;

            case 5:
                day+=121+Integer.parseInt(strs[2]);                break;

            case 6:
                day+=152+Integer.parseInt(strs[2]);                break;

            case 7:
                day+=182+Integer.parseInt(strs[2]);
                break;
            case 8:
                day+=213+Integer.parseInt(strs[2]);                break;

            case 9:
                day+=244+Integer.parseInt(strs[2]);                break;

            case 10:
                day+=274+Integer.parseInt(strs[2]);                break;

            case 11:
                day+=305+Integer.parseInt(strs[2]);                break;

            case 12:
                day+=335+Integer.parseInt(strs[2]);                break;
        }

        if (!((Integer.parseInt(strs[0]) % 4 == 0 && Integer.parseInt(strs[0]) % 100 != 0) || Integer.parseInt(strs[0]) % 400 == 0)) {
            day -= 1;
        }else{
            if(Integer.parseInt(strs[1])<=2){
                day -= 1;
            }
        }


        return day;
    }
}
