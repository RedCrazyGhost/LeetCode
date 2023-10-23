package 每日一题;


import java.util.*;

/**
 * 2357. 使数组中所有元素都等于零
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/02/24 10:58
 **/
public class Question2357 {
    public int minimumOperations(int[] nums) {
        int[] arr=new int[100];
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0&&arr[nums[i]-1]==0){
                num+=1;
                arr[nums[i]-1]+=1;
            }
        }
        return num;
    }


//    HashSet
//    public int minimumOperations(int[] nums) {
//        Set<Integer>set=new HashSet<>();
//        for (int i : nums) {
//            if (i!=0) {
//                set.add(i);
//            }
//        }
//        return set.size();
//    }
}
