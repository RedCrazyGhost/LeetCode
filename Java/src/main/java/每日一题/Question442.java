package 每日一题;

import java.util.*;

/**
 * 442. 数组中重复的数据
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/08 19:22
 **/
public class Question442 {

//   官方
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] > 0) {
                nums[x - 1] = -nums[x - 1];
            } else {
                ans.add(x);
            }
        }
        return ans;
    }


//    重排
//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer>list=new ArrayList<>();
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i]==nums[i+1]){
//                list.add(nums[i]);
//            }
//        }
//        return list;
//    }

//    桶
//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer>list=new ArrayList<>();
//        int[] arr=new int[nums.length+1];
//        for(int i:nums){
//            if (arr[i]+1==2){
//                list.add(i);
//            }else{
//                arr[i]+=1;
//            }
//        }
//        return list;
//    }

//    HashSet
//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer> list=new ArrayList<>();
//        Set<Integer> set=new HashSet<>();
//        for(int i:nums){
//            if(!set.add(i)){
//                list.add(i);
//            }
//        }
//        return list;
//    }

//    HashMap
//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer> list=new ArrayList<>();
//        Map<Integer,Integer>map=new HashMap<>();
//        for(int i:nums){
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//            if (entry.getValue()==2){
//                list.add(entry.getKey());
//            }
//        }
//        return list;
//    }
}
