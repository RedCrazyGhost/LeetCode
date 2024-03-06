package daily;

import java.util.HashMap;
import java.util.Map;

public class Question2048 {
    public int nextBeautifulNumber(int n) {
        while(true){
            if(isNumber(++n)){
                return n;
            }
        }
    }
    public boolean isNumber(int n){
        Map<Integer,Integer> map=new HashMap<>();
        while(n!=0){
            map.put(n%10, map.getOrDefault(n%10,0)+1);
            n/=10;
        }

        for(Integer i:map.keySet()){
            if(map.get(i)!=i){
                return false;
            }
        }
        return true;
    }
}
