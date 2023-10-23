package 每日一题;

/**
 * 1860. 增长的内存泄露
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/19 20:14
 **/
public class Question1860 {
    public int[] memLeak(int memory1, int memory2) {
        int[] arr=new int[3];
        arr[1]=memory1;
        arr[2]=memory2;
        while(true){
            if (arr[1]>=arr[2]){
                if (arr[1]-arr[0]>=0){
                    arr[1]-=arr[0]++;
                }else{
                    break;
                }
            }else{
                if (arr[2]-arr[0]>=0){
                    arr[2]-=arr[0]++;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}
