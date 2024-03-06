package daily;

/**
 * 2367. 算术三元组的数目
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/31 12:16
 **/
public class Question2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int num=0;
        int len = nums.length;
      level1:  for (int i = 0; i < len-2; i++) {
      level2:      for (int j = i+1; j < len-1; j++) {
                if (nums[j]-nums[i]==diff) {
                    for (int k = j + 1; k < len; k++) {
                        if (nums[k]-nums[j]==diff) {
                            num+=1;
                            continue level1;
                        } else if (nums[k]-nums[j]>diff) {
                            break level2;
                        }
                    }
                } else if (nums[j]-nums[i]>diff) {
                    continue level1;
                }
            }
        }
        return num;
    }
}
