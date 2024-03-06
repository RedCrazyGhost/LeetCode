package daily;

import model.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 623. 在二叉树中增加一行
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/08/05 14:33
 **/
public class Question623 {
    // 官方DFS解法
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (root == null) {
            return null;
        }
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }
        if (depth == 2) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
        } else {
            root.left = addOneRow(root.left, val, depth - 1);
            root.right = addOneRow(root.right, val, depth - 1);
        }
        return root;
    }
}
