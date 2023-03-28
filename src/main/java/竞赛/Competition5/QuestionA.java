package 竞赛.Competition5;

/**
 * 1
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/21 19:13
 **/
public class QuestionA {
    public static void main(String[] args) {
        int index=1;
        int sum=0;
        while(index<=78120){
            if (78120%index==0){
                sum+=1;
            }
            index+=1;
        }
        System.out.println(sum);
//     ✅  结果： 96
    }
}
