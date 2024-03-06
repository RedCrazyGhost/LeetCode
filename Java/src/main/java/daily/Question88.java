package daily;

public class Question88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i1=m-1,i2=n-1,index=m+n-1;
       while(index>-1&&i1>-1&&i2>-1){
           if (nums1[i1]>=nums2[i2]){
               nums1[index--]=nums1[i1--];
           }else if (nums2[i2]>=nums1[i1]){
               nums1[index--]=nums2[i2--];
       }}
       if (i1==-1){
           for (;index >-1 ; index--) {
               nums1[index]=nums2[i2--];
           }
       }

    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
//
//        Arrays.sort(nums1);
//    }
}
