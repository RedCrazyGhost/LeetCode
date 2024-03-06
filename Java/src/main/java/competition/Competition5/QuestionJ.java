package competition.Competition5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 子串分值
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/21 20:55
 **/
public class QuestionJ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int sum=0;
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            Set<Character> set=new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                if(!set.add(chars[j])){
                    set.remove(chars[j]);
                }
                sum+=set.size();
            }
        }
        System.out.println(sum);
    }
}
