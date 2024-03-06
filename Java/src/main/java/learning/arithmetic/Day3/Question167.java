package learning.算法入门.Day3;

/**
 * 167. 两数之和 II - 输入有序数组
 *
 * @author wenxingzhan
 * @date 2021/12/27 14:27
 **/
public class Question167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j<numbers.length&&numbers[j]+numbers[i]<=target; j++) {
                if (numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[2];
    }
}
