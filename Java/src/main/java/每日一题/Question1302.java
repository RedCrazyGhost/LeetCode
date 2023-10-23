package 每日一题;

import 数据结构模型.TreeNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * 1302. 层数最深叶子节点的和
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/08/17 21:39
 **/
public class Question1302 {

    //最优解
    int max = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        help(root, 0);
        return sum;
    }
    void help(TreeNode root, int level) {
        if (root == null) return;
        if (level > max) {
            max = level;
            sum = root.val;
        } else if (level == max)
            sum += root.val;
        help(root.left, level + 1);
        help(root.right, level + 1);
    }


//    public int deepestLeavesSum(TreeNode root) {
//        int sum = 0;
//        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            sum = 0;
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                sum += node.val;
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//            }
//        }
//        return sum;
//    }

//    O(N^2) 好怪啊？
//    public int deepestLeavesSum(TreeNode root) {
//        Queue<TreeNode> queue=new ArrayDeque<>();
//        queue.add(root);
//        int nextnum=0;
//        int deepnum=1;
//        int sum=0;
//        while(!queue.isEmpty()){
//            if (deepnum==0){
//                deepnum=nextnum;
//                nextnum=0;
//                sum=0;
//            }
//            TreeNode node=queue.poll();
//            sum+=node.val;
//            if (node.left!=null){
//                queue.add(node.left);
//                nextnum+=1;
//            }
//            if (node.right!=null){
//                queue.add(node.right);
//                nextnum+=1;
//            }
//            deepnum-=1;
//        }
//
//
//        return sum;
//    }
}
