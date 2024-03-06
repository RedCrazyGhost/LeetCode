package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 506. 相对名次
 *
 * @author wenxingzhan
 * @date 2021/12/02 16:34
 **/
public class Question506 {
//    public String[] findRelativeRanks(int[] score) {
//        Map<Integer,Integer> map=new HashMap<>();
//        int len=score.length;
//        for (int i = 0; i < len; i++) {
//            map.put(score[i],i);
//        }
//        String[] strings=new String[len];
//
////        Set集合自然排序 1111 会排在111前面;
//
//        Arrays.sort(score);
//        for(int i:score){
//            switch (len){
//                case 1:
//                    strings[map.get(i)]="Gold Medal";
//                    break;
//                case 2:
//                    strings[map.get(i)]="Silver Medal";
//                    break;
//                case 3:
//                    strings[map.get(i)]="Bronze Medal";
//                    break;
//                default:
//                    strings[map.get(i)]=len+"";break;
//            }
//            len-=1;
//        }
//        return strings;
//    }

//   数组脚标存储排序（最优解）
    public String[] findRelativeRanks(int[] score) {
        int max=0;
        int len=score.length;
        String[] strings=new String[len];

            for(int i:score){
            max=Math.max(i,max);
        }
        int[] arr=new int[max+1];
            for (int i = 0; i < score.length; i++) {
    //            进行排序并且记录脚标位置
            arr[score[i]]=i+1;
        }
        int num=1;
            for (int i =max; i >=0 ; --i) {
            if(arr[i]!=0){
                switch (num){
                    case 1: strings[arr[i]-1]="Gold Medal";break;
                    case 2: strings[arr[i]-1]="Silver Medal";break;
                    case 3:  strings[arr[i]-1]="Bronze Medal";break;
                    default:
                        strings[arr[i]-1]=num+"";
                        break;
                }
                num++;
            }
        }
            return strings;
    }
}
