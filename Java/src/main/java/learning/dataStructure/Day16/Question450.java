package learning.数据结构基础.Day16;

import model.TreeNode;

/**
 * 450. 删除二叉搜索树中的节点
 *
 * @author wenxingzhan
 * @date 2022/01/21 13:59
 **/
public class Question450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)return null;

        if (key > root.val)
            root.right = deleteNode(root.right, key); // 去右子树删除

        else if(key < root.val)
            root.left = deleteNode(root.left, key);  // 去左子树删除

        else  {  // 当前节点就是要删除的节点

            if (root.left == null)   return root.right;      // 情况1，欲删除节点无左子
            else if (root.right == null)  return root.left;  // 情况2，欲删除节点无右子
            else if (root.left!=null && root.right !=null){  // 情况3，欲删除节点左右子都有
                TreeNode node = root.right;
                while (node.left != null)      // 寻找欲删除节点右子树的最左节点
                    node = node.left;

                node.left = root.left;     // 将欲删除节点的左子树成为其右子树的最左节点的左子树
                root = root.right;         // 欲删除节点的右子顶替其位置，节点被删除
            }
        }
        return root;
    }
}
