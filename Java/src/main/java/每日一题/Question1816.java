package 每日一题;

/**
 * 1816. 截断句子
 *
 * @author wenxingzhan
 * @date 2021/12/06 12:47
 **/
public class Question1816 {
    public String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for (String str:s.split(" ")){
           if (k==1){
               sb.append(str);
               break;
           }else{
               sb.append(str).append(' ');
           }
           k-=1;
        }
        return sb.toString();
    }
}
