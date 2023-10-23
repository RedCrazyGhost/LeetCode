package 学习计划.算法入门.Day12;

/**
 * 198. 打家劫舍
 * dp
 * @author wenxingzhan
 * @date 2021/11/14 11:27
 **/
/*
情况分析：
1 2 3 1

2 7 9 3 1

往后判断几步 3步？

 */
public class Question198 {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int length = nums.length;
            if (length == 1) {
                return nums[0];
            }
            int first = nums[0], second = Math.max(nums[0], nums[1]);
            for (int i = 2; i < length; i++) {
                int temp = second;
                second = Math.max(first + nums[i], second);
                first = temp;
            }
            return second;
        }
    }

