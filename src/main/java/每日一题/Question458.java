package 每日一题;

/**
 * 458. 可怜的小猪
 *
 * @author wenxingzhan
 * @date 2021/11/25 16:25
 **/
public class Question458 {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        return  (int)Math.ceil(Math.log(buckets)/Math.log((double) minutesToTest/minutesToDie+1));
    }
}
