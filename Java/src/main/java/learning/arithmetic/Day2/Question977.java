package learning.算法入门.Day2;

/**
 * 977. 有序数组的平方
 *
 * @author wenxingzhan
 * @date 2021/12/26 12:59
 **/
public class Question977 {
    public int[] sortedSquares(int[] nums) {
        int indexleft=0;
        int indexright= nums.length-1;
        int[] arr=new int[nums.length];
        int index= nums.length-1;

       while(indexright>=indexleft){
           if (Math.abs(nums[indexleft])>=Math.abs(nums[indexright])){
               arr[index--]=nums[indexleft]*nums[indexleft];
               indexleft++;
           }else{
               arr[index--]=nums[indexright]*nums[indexright];
               indexright--;
           }
       }
       return arr;
    }
}
