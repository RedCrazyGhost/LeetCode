package 竞赛.Competition7;

import java.util.*;

/**
 * 试题 D: 最少刷题数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/10 11:21
 **/
public class QuestionD {
    public void methode(){
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr=new int[len];
        Set<Integer> set=new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
            set.add(arr[i]);
        }
        List<Integer> list=new ArrayList<>(set);
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < list.size()/2; i++) {
            map.put(list.get(i),list.get((list.size()/2))- list.get(i)+1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=map.getOrDefault(arr[i],0);
        }
        System.out.println(Arrays.toString(arr));
    }
}
