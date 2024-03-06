package daily;

import java.util.*;

/**
 * 384. 打乱数组
 *
 * @author wenxingzhan
 * @date 2021/11/22 13:33
 **/
public class Question384 {
    int[] arr;
    public Question384(int[] nums) {
        arr=nums;
    }

    public int[] reset() {
return arr;
    }

    public int[] shuffle() {
        int[] o=new int[arr.length];
        Set<Integer> set=new HashSet<>();
        for (int i:arr){
            int j=(int)(Math.random()*arr.length);
            while(!set.add(j)){
                j=(int)(Math.random()*arr.length);
            }
            o[j]=i;
        }
        return o;
    }
}
