package 竞赛.Competition9;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 竖读数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/26 08:11
 **/
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        String[] strings=new String[len];
        for (int i = 0; i < len; i++) {
            strings[i]= scanner.next();
        }
        int[] arr=new int[strings[0].length()];
        List<String> list1=new LinkedList<>();
        for (int i = 0; i < strings[0].length(); i++) {
            StringBuilder stringBuilder=new StringBuilder();
            for (int j = 0; j < len; j++) {
                stringBuilder.append(strings[j].charAt(i));
            }
            arr[i]=Integer.parseInt(stringBuilder.toString());
        }
        Arrays.sort(arr);
        StringBuilder stringBuilder=new StringBuilder();
        for(int i:arr){
            stringBuilder.append(i).append(' ');
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1));
    }
}
