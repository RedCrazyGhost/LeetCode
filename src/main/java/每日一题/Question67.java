package 每日一题;

/**
 * 67. 二进制求和
 *
 * @author wenxingzhan
 * @date 2022/03/16 15:31
 **/
public class Question67 {
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder=new StringBuilder();
        int indexA=a.length()-1,indexB=b.length()-1;
        int nextNum=0;
        while(indexA>=0||indexB>=0||nextNum!=0){
            int sum=nextNum;
            if (indexA>=0){
                sum+=a.charAt(indexA--)-'0';
            }
            if (indexB>=0){
                sum+=b.charAt(indexB--)-'0';
            }
            stringBuilder.insert(0,sum%2);
            nextNum=sum/2;
        }
        return stringBuilder.toString();
    }
}
