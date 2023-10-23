package 每日一题;

/**
 * 1769. 移动所有球到每个盒子所需的最小操作数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/28 17:32
 **/
public class Question1769 {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j!=i&&boxes.charAt(j)=='1'){
                   arr[i]+=Math.abs(i-j);
                }
            }
        }
        return arr;
    }
}
