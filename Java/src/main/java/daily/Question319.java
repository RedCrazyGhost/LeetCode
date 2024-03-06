package daily;

/**
 * 319. 灯泡开关
 *
 * @author wenxingzhan
 * @date 2021/11/15 11:27
 **/
public class Question319 {
    public int bulbSwitch(int n) {
//        int[] arr=new int[n];
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < arr.length; j+=i) {
//                if (arr[j]==0){
//                    arr[j]=1;
//                }else{
//                    arr[j]=0;
//                }
//            }
//        }
//        int num=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==1){
//                num++;
//            }
//        }
//        return num;

//      数学题
        return (int) Math.sqrt(n + 0.5);
    }
}
