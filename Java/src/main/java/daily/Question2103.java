package daily;

import java.util.Arrays;

/**
 * 2103. 环和杆
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/11/02 23:26
 **/
public class Question2103 {
    public int countPoints(String rings) {
        int[] lists=new int[10];
        char[] chars=rings.toCharArray();
        for(int i=0;i<chars.length;i+=2){
            switch (chars[i]){
                case 'R':
                    lists[(chars[i+1]-'0')]|=1;
                    break;
                case 'G':
                    lists[(chars[i+1]-'0')]|=2;
                    break;
                case 'B':
                    lists[(chars[i+1]-'0')]|=4;
                    break;
                default:break;
            }
        }
        int num=0;
        for(int i:lists){
            if (i==7)num+=1;
        }
        return num;
    }
}
