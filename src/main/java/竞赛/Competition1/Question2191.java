package 竞赛.Competition1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 2191. 将杂乱无章的数字排序
 *
 * @author wenxingzhan
 * @date 2022/03/09 10:12
 **/
public class Question2191 {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            char[] chars=String.valueOf(nums[i]).toCharArray();
            for (int j = 0; j <chars.length ; j++) {
                chars[j]= (char) (mapping[chars[j]-'0']+'0');
            }
            list.add(new int[]{nums[i],Integer.parseInt(String.valueOf(chars))});
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int num = o1[1] - o2[1];
                if (num > 0) {
                    return 1;
                } else if (num < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int[] arr=new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i)[0];
        }
        return arr;
    }
}
