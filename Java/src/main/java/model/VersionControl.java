package model;

/**
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/02 12:48
 **/
public class VersionControl {
    int badVersion=0;
    public VersionControl(int badVersion){
        this.badVersion=badVersion;
    }
    public boolean isBadVersion(int version){
        return version==badVersion;
    }
}
