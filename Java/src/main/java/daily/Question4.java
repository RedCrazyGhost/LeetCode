package daily;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int nums1[]={1,2};
        int nums2[]={3};

        /*
        时间 3ms 47.48%
        内存 39.8mb 29.9%
         */
        int nums3[]=new int[nums1.length+nums2.length];
        for (int i = 0; i < nums3.length; i++) {
            if (i >=nums1.length){
                nums3[i]=nums2[i-nums1.length];
            }else{
                nums3[i]=nums1[i];
            }
        }
        Arrays.sort(nums3);
        if (nums3.length%2==0){
            System.out.println((double) (nums3[nums3.length/2-1]+ nums3[nums3.length/2])/2);
        }else {
            System.out.println((double) nums3[nums3.length/2]);
        }

    }
}
