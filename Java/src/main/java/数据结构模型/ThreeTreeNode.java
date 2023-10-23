package 数据结构模型;

/**
 * ThreeTreeNode  Question116
 *
 * @author wenxingzhan
 * @date 2022/01/01 15:08
 **/
public class ThreeTreeNode {
    public int val;
    public ThreeTreeNode left;
    public ThreeTreeNode right;
    public ThreeTreeNode next;

    public ThreeTreeNode() {
    }

    public ThreeTreeNode(int val) {
        this.val = val;
    }

    public ThreeTreeNode(int val, ThreeTreeNode left, ThreeTreeNode right, ThreeTreeNode next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}
