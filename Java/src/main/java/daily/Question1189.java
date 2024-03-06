package daily;

/**
 * 1189. “气球” 的最大数量
 *
 * @author wenxingzhan
 * @date 2022/02/13 13:59
 **/
public class Question1189 {
    public int maxNumberOfBalloons(String text) {
        int[] arr=new int[26];
        for (char c : text.toCharArray()) {
            arr[c-'a']+=1;
        }
        int num=Math.min(arr[0],arr[1]);
        num=Math.min(arr['l'-'a']/2,num);
        num=Math.min(arr['o'-'a']/2,num);
        num=Math.min(arr['n'-'a'],num);
        return num;
    }
}
