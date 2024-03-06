package daily;

import java.util.LinkedList;
import java.util.List;

/**
 * 1389. 按既定顺序创建目标数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/28 17:48
 **/
public class Question1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new LinkedList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(index[i],nums[i]);
        }
        int[] target=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i]=list.get(i);
        }
        return target;
    }
}
