package 每日一题;

/**
 * 944. 删列造序
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/12 15:19
 **/
public class Question944 {

//    类似竖读
    public int minDeletionSize(String[] strs) {
        int sum=0;
        for (int i = 0; i <strs[0].length() ; i++) {
            for (int j = 0; j <strs.length-1 ; j++) {
                if(strs[j+1].charAt(i)-strs[j].charAt(i)<0){
                    sum+=1;
                    break;
                }
            }
        }
        return sum;
    }
}
