package 每日一题;

/**
 * 258. 各位相加
 *
 * @author wenxingzhan
 * @date 2022/03/03 10:40
 **/
public class Question258 {
    public int addDigits(int num) {
//        int nextnum=0;
//        while(true){
//            nextnum+=num%10;
//            num/=10;
//            if (num==0){
//              if (nextnum/10==0){
//                  return nextnum;
//              }else{
//                  num=nextnum;
//                  nextnum=0;
//              }
//            }
//        }

//       数学公式
        return (num - 1) % 9 + 1;
    }
}
