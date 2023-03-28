package 每日一题;

/**
 * 面试题 17.19. 消失的两个数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/09/26 15:03
 **/
public class QuestionInterview1719 {
    public int[] missingTwo(int[] nums) {
        int[] arr=new int[2];
        int[] map=new int[nums.length+2];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i]-1]+=1;
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i]==0){
                if (arr[0]!=0){
                    arr[1]=i+1;
                    break;
                }else{
                    arr[0]=i+1;
                }
            }
        }

        return arr;
    }
}
