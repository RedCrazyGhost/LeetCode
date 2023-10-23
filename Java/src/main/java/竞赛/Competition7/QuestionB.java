package 竞赛.Competition7;

/**
 * 试题 B: 山
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/10 11:11
 **/
public class QuestionB {
    public void methode(){
        int sum=0;
      top:  for (int i = 2022; i <= 2022222022 ; i++) {
            char[] chars=String.valueOf(i).toCharArray();
            for (int j = 0; j < chars.length/2; j++) {
                if (chars[j]!=chars[chars.length-1-j]||chars[j]>chars[j+1]){
                    continue top;
                }
            }
            sum+=1;
        }
//        sum= 3138
        System.out.println("[2022 , 2022222022] 中存在的回文数个数 ："+sum);
    }
}
