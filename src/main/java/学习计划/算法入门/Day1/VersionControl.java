package 学习计划.算法入门.Day1;

/**
 * Question278 的测试条件
 *
 * @author wenxingzhan
 * @date 2021/12/25 17:07
 **/
public class VersionControl {
    int bedversion;
    public VersionControl(int badversion){
        this.bedversion=badversion;
    }

    public boolean isBadVersion(int version) {
        return version >= bedversion;
    }
}
