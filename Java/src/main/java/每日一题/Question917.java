package 每日一题;

/**
 * 917. 仅仅反转字母
 *
 * @author wenxingzhan
 * @date 2022/02/23 17:57
 **/
public class Question917 {
    public String reverseOnlyLetters(String s) {
        char[] chars=s.toCharArray();
        char[] newChars=s.toCharArray();

        int index=0,index1=chars.length-1;
        while(index<chars.length&&index1>-1){
            if (('a'<=chars[index]&&'z'>=chars[index])||('A'<=chars[index]&&'Z'>=chars[index])){
                if (('a'<=newChars[index1]&&'z'>=newChars[index1])||('A'<=newChars[index1]&&'Z'>=newChars[index1])){
                    newChars[index1]=chars[index];
                    index1-=1;
                    index+=1;
                }else{
                    index1-=1;
                }
            }else{
                index+=1;
            }
        }



        return new String(newChars);
    }
}
