package learning.数据结构基础.Day17;

import model.TreeNode;

import java.util.*;

/**
 * 230. 二叉搜索树中第K小的元素
 *
 * @author wenxingzhan
 * @date 2022/01/24 15:12
 **/
public class Question230 {
    public int kthSmallest(TreeNode root, int k) {
//        暴力
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return list.get(k-1);
    }
}
