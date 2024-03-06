package daily;

public class Question53 {
    public static void main(String[] args) {
        //输入参数：
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //解题步骤：
        int index = 0,max=nums[0];
        for (int i : nums){
            index = Math.max(index + i, i);
            max = Math.max(max,index);
        }
        System.out.println(max);

    }
}
