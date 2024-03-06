package daily;

/**
 * 553. 最优除法
 *
 * @author wenxingzhan
 * @date 2022/02/27 19:26
 **/
public class Question553 {
//    数学  贪心
    public String optimalDivision(int[] nums) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i>0){
                stringBuilder.append("/");
            }
            if (nums.length>2&&i==1){
                stringBuilder.append("(");
            }
            stringBuilder.append(nums[i]);
            if (nums.length>2&&i== nums.length-1){
                stringBuilder.append(")");
            }

        }

        return stringBuilder.toString();
    }
}
