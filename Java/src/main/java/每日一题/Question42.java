package 每日一题;

/**
 * 42. 接雨水
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/23 17:29
 **/
public class Question42 {
    public int trap(int[] height) {
        int sum=0;
        int[] pArr=new int[height.length];
        int[] sArr=new int[height.length];

        pArr[0]=height[0];
        sArr[height.length-1]=height[height.length-1];

        for (int i = 1; i < height.length; i++) {
            pArr[i]= Math.max(height[i], pArr[i - 1]);
        }

        for (int i = height.length-2; i >-1 ; i--) {
            sArr[i]= Math.max(height[i], sArr[i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            sum += Math.min(sArr[i],pArr[i])-height[i];
        }

        return sum;
    }

    //LeetCode官网 单调栈
//    public int trap(int[] height) {
//        int ans = 0;
//        Deque<Integer> stack = new LinkedList<Integer>();
//        int n = height.length;
//        for (int i = 0; i < n; ++i) {
//            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
//                int top = stack.pop();
//                if (stack.isEmpty()) {
//                    break;
//                }
//                int left = stack.peek();
//                int currWidth = i - left - 1;
//                int currHeight = Math.min(height[left], height[i]) - height[top];
//                ans += currWidth * currHeight;
//            }
//            stack.push(i);
//        }
//        return ans;
//    }
}
