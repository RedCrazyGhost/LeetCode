package competition.Competition9;

/**
 * 数组非质数下标循环删除
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/26 09:20
 **/
public class Question2 {
    public int getNumber (int[] a) {
        do {
            int len=0;
            for (int i = 1; i <= a.length; i++) {
                if (!IsPrime(i)){
                    a[i-1]=-1;
                }else{
                    len+=1;
                }
            }
            int[] arr=new int[len];
            int index=0;
            for (int i = 0; i < a.length; i++) {
                if (a[i]!=-1){
                    arr[index++]=a[i];
                }
            }
            a=arr;
        }while(a.length!=1);

        return a[0];
    }

    //判断质数
    public  boolean IsPrime(int n){
        if (n <= 3) {
            return n > 1;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}