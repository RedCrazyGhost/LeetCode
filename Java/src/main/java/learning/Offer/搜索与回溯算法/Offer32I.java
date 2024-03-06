package learning.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/29 18:08
 **/
public class Offer32I {
//    BFS
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node!=null) {
                list.add(node.val);
            }
            if (node != null && node.left != null) {
                queue.add(node.left);
            }
            if (node != null && node.right != null) {
                queue.add(node.right);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

}
