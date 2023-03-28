package 每日一题;

/**
 * 481. 神奇字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/31 10:03
 **/
public class Question481 {
    public int magicalString(int n) {
       int[] arr=new int[n+1];
       arr[0]=1;
       int value=1,len=1,index=1,count=2,num=1;
       while(len<n){
           value ^=3;
           while(count-->0&&len<n){
                arr[len++]=value;
                if (value==1) num+=1;
           }
           count=arr[++index];
       }
        return num;
    }


}
