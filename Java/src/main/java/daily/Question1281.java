package daily;

/**
 * 1281. 整数的各位积和之差
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/28 17:40
 **/
public class Question1281 {
    public int subtractProductAndSum(int n) {
        int sum=0,product=1;
        while(n/10!=0||n%10!=0){
            int i=n%10;
            sum+=i;
            product*=i;
            n/=10;
        }
        return product-sum;
    }

//  字节数组处理
//    public int subtractProductAndSum(int n) {
//        String str=String.valueOf(n);
//        int ji=1,sum=0;
//        for (int i = 0; i < str.length(); i++) {
//            int num=str.charAt(i)-'0';
//            ji*=num;
//            sum+=num;
//        }
//        return ji-sum;
//    }
}
