package daily;

/**
 * 1247. 交换字符使得字符串相同
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/02/25 14:28
 **/
public class Question1247 {

    public int minimumSwap(String s1, String s2) {
        int xy=0,yx=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)=='x'&&s2.charAt(i)=='y'){
                xy++;
            }else if (s1.charAt(i)=='y'&&s2.charAt(i)=='x'){
                yx++;
            }
        }
        if ((xy+yx)%2==1){
            return -1;
        }
        return xy/2+yx/2+xy%2+yx%2;
    }
}
