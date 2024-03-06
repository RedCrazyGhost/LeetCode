package competition.Competition4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 蓝桥杯 题目 1004: [递归]母牛的故事
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/17 19:03
 **/
public class Question1004 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int year=0;
        while (scanner.hasNext()) {
            int num=scanner.nextInt();
            if (num==0){
                break;
            }else {
                year = Math.max(year, num);
                list.add(year);
            }
        }
        int[] arr=new int[year];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        for (int i = 3; i <year ; i++) {
            arr[i]=arr[i-3]+arr[i-1];
        }
        for (Integer integer : list) {
            System.out.println(arr[integer - 1]);
        }

    }

}
