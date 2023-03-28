package 学习计划.数据结构基础.Day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 187. 重复的DNA序列
 *
 * @author wenxingzhan
 * @date 2022/01/14 00:20
 **/
public class Quesion187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        if (s.length()<=10){
            return list;
        }
        Set<String> set=new HashSet<>();
        // 循环判断条件有误
        for (int i = 0; i <=s.length()-10 ; i++) {
            if(!set.add(s.substring(i,i+10))){
                if (!list.contains(s.substring(i,i+10))){
                    list.add(s.substring(i,i+10));
                }
            }
        }


        return list;
    }
}
