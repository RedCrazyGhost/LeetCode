package daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 954. 二倍数对数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/01 10:19
 **/
public class Question954 {
    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            if (i<0){

                if(map.containsKey(2 * i)&&map.get(2 * i)!=0){
                    map.put(2 * i,map.get(2 * i)-1);
                }else{
                    map.put(i,map.getOrDefault(i,0)+1);
                }

            }else{

                if (map.containsKey(i)&&map.get(i)!=0){
                    map.put(i,map.get(i)-1);
                }else{
                    map.put(2 * i,map.getOrDefault(2 * i,0)+1);
                }

            }
        }
        for(int i:map.values()){
            if (i!=0){
                return false;
            }
        }
        return true;
    }
}
