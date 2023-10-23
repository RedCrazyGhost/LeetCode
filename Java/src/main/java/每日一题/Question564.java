package 每日一题;

/**
 * 564. 寻找最近的回文数
 *
 * @author wenxingzhan
 * @date 2022/03/02 10:16
 **/
public class Question564 {
//    暴力
    public String nearestPalindromic(String n) {
       long num=Long.parseLong(n);
       long index=1;
       String okstr=null;
       while(true){
           okstr=ok(num-index);
           if (okstr!=null){
               return okstr;
           }
           okstr=ok(num+index);
           if (okstr!=null){
               return okstr;
           }
           index+=1;
       }
    }

    public String ok(long num){
        char[] chars=String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            if (chars[i]!=chars[chars.length-i-1]){
                return null;
            }
        }
        return String.valueOf(num);
    }
}
