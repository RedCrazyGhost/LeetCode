package 每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * 204. 计数质数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/28 13:40
 **/
public class Question204 {
//   线性筛选
    public int countPrimes(int n) {
        List<Integer> list=new ArrayList<>();
       int[] arr=new int[n+1];
        for (int i = 2; i < n; i++) {
            if(arr[i]==0){
                list.add(i);
            }
            for (int j = 0; j < list.size() && i*list.get(j)<n; j++) {
                arr[i*list.get(j)]=1;
                if (i%list.get(j)==0){
                    break;
                }

            }
        }
        return list.size();
    }

//    暴力解法 timeout
//    public int countPrimes(int n) {
//        int num = 0;
//        for (int i = n; i > 0; i--) {
//            if (isPrimes(i)){
//                num+=1;
//            }
//        }
//        return num;
//    }
//    public boolean isPrimes(int n){
//        if (n<=3){
//            return n>1;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if(n%i==0){
//                return  false;
//            }
//        }
//        return true;
//    }
}
