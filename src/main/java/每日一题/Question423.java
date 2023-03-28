package 每日一题;

import java.util.*;

/**
 * 423. 从英文中重建数字
 *
 * @author wenxingzhan
 * @date 2021/11/24 13:10
 **/

public class Question423 {
/*
zero    z   1
one     o   9
two     w   2
three   t   6
four    u   3
five    v   7
six     x   4
seven   s
eight   g   5
nine    i
 */
    public String originalDigits(String s) {
        Map<Character,Integer> map=new HashMap<>();
        List<Character> charlist=new ArrayList<>();
        for (char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String[] stream={"z-zero-0","w-two-2","u-four-4","x-six-6","g-eight-8","s-seven-7","t-three-3","v-five-5","o-one-1","i-nine-9"};
        for (int i = 0; i < stream.length; i++) {
            if(map.containsKey(stream[i].charAt(0))){
                int num=map.get(stream[i].charAt(0));
                for (int j = 2; j <stream[i].length()-2 ; j++) {
                    if (map.get(stream[i].charAt(j))-num==0){
                        map.remove(stream[i].charAt(j));
                    }else {
                        map.put(stream[i].charAt(j), map.get(stream[i].charAt(j)) - num);
                    }
                }
                for (int j = 0; j < num; j++) {
                    charlist.add(stream[i].charAt(stream[i].length()-1));
                }
            }
        }
        Collections.sort(charlist);
        StringBuilder stringBuilder=new StringBuilder();
        for(char c: charlist){
            stringBuilder.append(c);
        }

        return stringBuilder.toString() ;

    }
}
