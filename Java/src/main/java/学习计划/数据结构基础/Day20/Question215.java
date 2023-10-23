package 学习计划.数据结构基础.Day20;

import java.util.*;

/**
 * 215. 数组中的第K个最大元素
 *
 * @author wenxingzhan
 * @date 2022/01/25 19:19
 **/
public class Question215 {
    public int findKthLargest(int[] nums, int k) {
//        暴力
//       Arrays.sort(nums);
//       return nums[nums.length-k];

            PriorityQueue<Integer> heap = new PriorityQueue<>();
            for (int num : nums) {
                heap.add(num);
                if (heap.size() > k) {
                    heap.poll();
                }
            }
            return heap.poll();
        }
    }
