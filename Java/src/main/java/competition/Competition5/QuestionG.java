package competition.Competition5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 单词分析
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/21 20:29
 **/
public class QuestionG {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();

        Map<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int value=-1;char charA=' ';
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()>value){
                value=entry.getValue();
                charA= entry.getKey();
            }
        }
        System.out.println(charA);

        System.out.println(value);
    }
}
