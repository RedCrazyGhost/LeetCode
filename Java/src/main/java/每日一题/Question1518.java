package 每日一题;

/**
 * 1518. 换酒问题
 *
 * @author wenxingzhan
 * @date 2021/12/17 12:39
 **/
public class Question1518 {
    int numExchange;
    public int numWaterBottles(int numBottles, int numExchange) {
        this.numExchange=numExchange;
        return dfs(numBottles,0);
    }
    public int dfs(int numBottles,int residueNum){
        return numBottles+((numBottles+residueNum)/numExchange==0?0:dfs((numBottles+residueNum)/numExchange,(numBottles+residueNum)%numExchange));
    }
}
