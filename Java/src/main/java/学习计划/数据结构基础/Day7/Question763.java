package 学习计划.数据结构基础.Day7;

import java.util.ArrayList;
import java.util.List;

/**
 * 763. 划分字母区间
 *
 * @author wenxingzhan
 * @date 2022/01/11 21:46
 **/
public class Question763 {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> partition = new ArrayList<Integer>();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }
}
