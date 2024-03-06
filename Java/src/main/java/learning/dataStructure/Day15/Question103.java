package learning.数据结构基础.Day15;

import model.TreeNode;

import java.util.*;

/**
 * 103. 二叉树的锯齿形层序遍历
 *
 * @author wenxingzhan
 * @date 2022/01/23 15:55
 **/
public class Question103 {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root!=null) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            int num=1;
            queue.add(root);
            while (!queue.isEmpty()) {
                List<Integer> list0=new ArrayList<>();
                int size= queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node=queue.poll();
                    if (node!=null) {
                        list0.add(node.val);
                        if (node.left!=null) {
                            queue.add(node.left);
                        }
                        if (node.right!=null) {
                            queue.add(node.right);
                        }
                    }
                }
                if (num%2==1) {
                    list.add(list0);
                }else{
                    Collections.reverse(list0);
                    list.add(list0);
                }
                num+=1;
            }
        }
        return list;
    }
}
