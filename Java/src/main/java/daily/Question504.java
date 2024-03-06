package daily;

/**
 * 504. 七进制数
 *
 * @author wenxingzhan
 * @date 2022/03/07 16:00
 **/
public class Question504 {
    public String convertToBase7(int num) {
//        StringBuilder stringBuilder=new StringBuilder();
//
//        if (num<0){
//            stringBuilder.append('-');
//            num*=-1;
//        }else if(num==0){
//            return stringBuilder.append(0).toString();
//        }
//        boolean flag=false;
//        for (int i = 12; i >-1; i--) {
//            int n=num/(int)Math.pow(7,i)%7;
//            if (!flag&&n!=0){
//                flag= true;
//            }
//            if (flag) {
//                stringBuilder.append(n);
//            }
//        }
//        return stringBuilder.toString();

        return Integer.toString(num,7);
    }
}
