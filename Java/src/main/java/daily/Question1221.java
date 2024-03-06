package daily;

/**
 * 1221. 分割平衡字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/26 16:03
 **/
public class Question1221 {
    public int balancedStringSplit(String s) {
        int num=0,sum=0;

        for(char c:s.toCharArray()){
            if (c=='R'){
                num++;
            }else{
                num--;
            }
            if (num==0){
                sum+=1;
            }
        }



        return sum;
    }
}
