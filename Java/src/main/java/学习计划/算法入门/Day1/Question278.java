package 学习计划.算法入门.Day1;

import 数据结构模型.VersionControl;

/**
 * 278. 第一个错误的版本
 *
 * @author wenxingzhan
 * @date 2021/12/25 15:11
 **/
public class Question278 {

    public int firstBadVersion(int n,int bad) {
        VersionControl v = new VersionControl(bad);
        int statr = 1;
        int end = n-1;
        while (statr <= end) {
           int index =statr +(end - statr) /2;
            if (v.isBadVersion(index)){
                end=index-1;
            }else{
                statr=index+1;
            }
        }
        return statr;
    }
}
