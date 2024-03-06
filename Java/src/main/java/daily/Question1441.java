package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 1441. 用栈操作构建数组
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/15 10:29
 **/
public class Question1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int index=1;
        for (int i = 0; i < target.length; i++,index++) {
            while(index<=target[i]){
                list.add("Push");
                if (index==target[i]){
                    break;
                }
                list.add("Pop");
                index+=1;
            }
        }
        return list;
    }
}
