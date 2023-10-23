package 每日一题;

/**
 * 717. 1比特与2比特字符
 *
 * @author wenxingzhan
 * @date 2022/02/20 19:54
 **/
public class Question717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        boolean flag=true;
        for (; i < bits.length; i++) {
            if (bits[i]==1){
                i+=1;
                flag=false;
            }else{
                flag=true;
            }
        }
        return flag;
    }
}
