package learning.Offer.位运算;

/**
 * 剑指 Offer 56 - II. 数组中数字出现的次数 II
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/08 16:26
 **/
public class Offer56II {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }

//
//    public int singleNumber(int[] nums) {
//        int[] arr=new int[32];
//        for (int num : nums) {
//            for (int i = 0; i < 32; i++) {
//                arr[i]+=(num>>i&1)==1?1:0;
//            }
//        }
//        int res=0;
//        for (int i = 31; i >-1; i--) {
//            res<<=1;
//            if (arr[i]%3==1){
//                res|=1;
//            }
//        }
//        return res;
//    }
}
