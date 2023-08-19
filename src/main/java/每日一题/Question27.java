package 每日一题;

/**
 * 27. 移除元素
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/13 23:03
 **/
public class Question27 {

    public int removeElement(int[] nums, int val) {
        int num=0,i=0;
        while(i < nums.length-num) {
            while(i+num<nums.length&&nums[i+num]==val) num++;
            for (int j = 0; i+j+num<nums.length&&j < num; j++) {
                nums[i+j]=nums[i+j+num];
            }
            i++;
        }
        return nums.length-num;
    }
}
