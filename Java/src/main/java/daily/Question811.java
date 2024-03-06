package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 811. 子域名访问计数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/05 10:55
 **/
public class Question811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map=new HashMap<>();
        for(String s:cpdomains){
           Integer i= Integer.valueOf(s.substring(0,s.indexOf(' ')));
           String url=s.substring(s.indexOf(' ')+1);
           map.put(url,map.getOrDefault(url,0)+i);
           while(url.indexOf('.')!=-1){
              url= url.substring(url.indexOf('.')+1);
               map.put(url,map.getOrDefault(url,0)+i);
           }
        }
        List<String>list=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            list.add(entry.getValue()+" "+entry.getKey());
        }
        return list;
    }
}
