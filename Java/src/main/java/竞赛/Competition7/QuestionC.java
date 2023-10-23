package 竞赛.Competition7;

import java.util.Scanner;

/**
 * 试题 C: 字符统计
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/10 11:15
 **/
public class QuestionC {
    public void methode(){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int[] arr=new int[26];
        int max=Integer.MIN_VALUE;
        for(char c:str.toCharArray()){
            arr[c-'A']+=1;
            max=Math.max(max,arr[c-'A']);
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                stringBuilder.append((char)(i+'A'));
            }
        }
        System.out.println("输出结果 ："+stringBuilder);
    }
}
