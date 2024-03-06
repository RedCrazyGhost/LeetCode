package model;

/**
 * 四叉树
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/01 14:32
 **/
public class FourTreeNode {
    public boolean val;
    public boolean isLeaf;
    public FourTreeNode topLeft;
    public FourTreeNode topRight;
    public FourTreeNode bottomLeft;
    public FourTreeNode bottomRight;


    public FourTreeNode() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public FourTreeNode(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public FourTreeNode(boolean val, boolean isLeaf, FourTreeNode topLeft, FourTreeNode topRight, FourTreeNode bottomLeft, FourTreeNode bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
