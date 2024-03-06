package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int[] max,min;
        if (nums1.length> nums2.length){
            max=nums1;
            min=nums2;
        }else{
            max=nums2;
            min=nums1;
        }
        for (int i = 0; i < min.length; i++) {
            map.put(min[i],map.getOrDefault(min[i],0)+1);
        }
        for (int j = 0; j < max.length; j++) {
            if (map.getOrDefault(max[j],-99)!=-99&&map.getOrDefault(max[j],-99)>0){
                list.add(max[j]);
                map.put(max[j],map.get(max[j])-1 );
            }
        }
        int[] arr=new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i);
        }

        return arr;
    }
}
