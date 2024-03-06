package daily;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * 1700. 无法吃午餐的学生数量
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/19 11:53
 **/
public class Question1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int index=0,num=students.length,deep=0;
        for (int i = 0; i < students.length; i=(i+1)%students.length) {
            if (students[i]==-1){
                continue;
            }
            deep+=1;
            if (students[i]==sandwiches[index]){
                students[i]=-1;
                sandwiches[index]=-1;
                index+=1;
                num-=1;
                deep=0;
            }
            if (index==sandwiches.length||deep==num){
                break;
            }
        }
        return num;


    }
}
