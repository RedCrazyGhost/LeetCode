package 数据结构模型;

import java.util.List;

/**
 * N叉树
 *
 * @author wenxingzhan
 * @date 2021/11/21 13:28
 **/
public class NTreeNode {
    public int val;
    public List<NTreeNode> children;

    public NTreeNode() {}

    public NTreeNode(int _val) {
        val = _val;
    }

    public NTreeNode(int _val, List<NTreeNode> _children) {
        val = _val;
        children = _children;
    }
}
