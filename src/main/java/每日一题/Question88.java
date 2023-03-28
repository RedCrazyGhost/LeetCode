package 每日一题;

import java.util.Arrays;

public class Question88 {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        nums1[0] <=0 开头 无法处理
//        int index=0;
//        if(n!=0){
//            for (int i = 0; i <m+n; i++) {
//                if(nums1[i]>nums2[index]){
//                    nums1[i]=nums2[index]+nums1[i];
//                    nums2[index]=nums1[i]-nums2[index];
//                    nums1[i]=nums1[i]-nums2[index];
//                }else if(nums1[i]==0){
//                    nums1[i]=nums2[index];
//                    nums2[index]=0;
//                    i=0;
//                    if((index+=1)==n){
//                        break;
//                    }
//                }
//            }
//        }

        for (int i = 0,j=0; i!=n ; j++) {
            nums1[j]=(nums1[j]==0?nums2[i++]:nums1[j]);
        }
        Arrays.sort(nums1);

        return nums1;
    }
}
