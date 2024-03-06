package daily;

import model.TreeNode;

import java.util.*;

/**
 * 653. 两数之和 IV - 输入 BST
 *
 * @author wenxingzhan
 * @date 2021/11/23 20:29
 **/
public class Question653 {
   Set<Integer> set=new HashSet<>();
   boolean flag=false;
    public boolean findTarget(TreeNode root, int k) {
        function(root,k);
        return flag;
    }


    public void function(TreeNode node, int k) {
        if (!flag) {
            if (!set.add(k - node.val)) {
                flag = true;
            }
            if (node.left != null && node.right != null) {
                function(node.left, k);
                function(node.right, k);
            } else if (node.left != null) {
                function(node.left, k);
            } else if (node.right != null) {
                function(node.right, k);
            }
        }
    }
}
