package 学习计划.数据结构基础.Day19;

/**
 * 997. 找到小镇的法官
 *
 * @author wenxingzhan
 * @date 2022/01/24 20:35
 **/
public class Question997 {
    public int findJudge(int n, int[][] trust) {
        int[][] arr=new int[n][2];

        for (int[] ints : trust) {
            arr[ints[0] - 1][0] += 1;
            arr[ints[1] - 1][1] += 1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i][0]==0&&arr[i][1]==n-1){
                return i+1;
            }
        }
        return -1;
    }
}
