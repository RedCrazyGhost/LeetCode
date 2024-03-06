package competition.OneAWeek339;

/**
 * 6364. 老鼠和奶酪
 * 动态规划
 * 暴力解
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/02 11:05
 **/
public class Question6364 {
    int []reward1;
    int[] reward2;
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        this.reward1=reward1;
        this.reward2=reward2;
        return Math.max(dfs(1,0,0,k),dfs(2,0,0,k));
    }

    private int dfs(int eat,int index,int num,int k) {
        if (index == reward1.length) {
            return num;
        }
        int i1 = reward1[index];
        int i2 = reward2[index];
        int middle = 0;

        if (k==reward1.length-index){
            num += i1;
            k-=1;
            middle = Math.max(middle, dfs(1, index + 1, num, k));
        }else if (k == 0) {
            num += i2;
            middle = Math.max(middle, dfs(2, index + 1, num, k));
        } else{
                if (eat==1){
                    num+=i1;
                    k-=1;
                }else{
                    num+=i2;
                }
                middle=Math.max(dfs(1,index+1,num,k),middle);
                middle=Math.max(dfs(2,index+1,num,k),middle);
            }
        return middle;
    }
}
