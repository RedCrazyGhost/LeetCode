package 学习计划.LeetCode75.Day7;

import 数据结构模型.VersionControl;

/**
 * 278. 第一个错误的版本
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/02 12:22
 **/
public class Question278 extends VersionControl {
    public Question278(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            // left+right 有可能出现数值溢出的情况
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
