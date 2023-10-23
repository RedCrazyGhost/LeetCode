package 每日一题;

/**
 * 1720. 解码异或后的数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/23 20:52
 **/
public class Question1720 {
    public int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        for (int i = 1; i < arr.length; i++) {
            arr[i]=encoded[i-1]^arr[i-1];
        }
        return arr;
    }
}
