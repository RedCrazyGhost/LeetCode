package learning.数据结构基础.Day1;

/**
 * 169. 多数元素
 *
 * @author wenxingzhan
 * @date 2021/12/28 20:05
 **/
public class Question169 {
    public int majorityElement(int[] nums) {
//        for (int i = 0; i <= nums.length/2; i++) {
//            int num=1;
//            for (int j = i+1; j <nums.length; j++) {
//                if (nums[i]==nums[j]){num+=1;}
//            }
//            if (num>nums.length/2){
//                return nums[i];
//            }
//        }
//        return -1;

//        Map<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//        }
//        for(Map.Entry e: map.entrySet()){
//           if( (int)e.getValue()> nums.length/2){
//               return (int) e.getKey();
//           }
//        }
//        return -1;


        int num=0;
        Integer isnums=null;
        for(int item:nums){
            if (num==0){
                isnums=item;
            }
            num+=(num==isnums)?1:-1;
        }
        return isnums;
    }
}
