package learning.Offer.搜索与回溯算法;

import model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 37. 序列化二叉树
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/04 16:35
 **/
public class Offer37 {
    // Encodes a tree to a single string.
    // BFS
    public String serialize(TreeNode root) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append('[');
        Queue<TreeNode> queue=new LinkedList<>();
        if (root!=null){
            queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node!=null) {
                stringBuilder.append(node.val).append(',');
                queue.add(node.left);
                queue.add(node.right);
            }else{
                stringBuilder.append("null").append(',');
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);}

        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }
        int index=0;
        String[] arr = data.substring(1, data.length() - 1).split(",");
        TreeNode root=new TreeNode(Integer.parseInt(arr[index++]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (index<arr.length&&!arr[index].equals("null")){
                node.left=new TreeNode(Integer.parseInt(arr[index]));
                queue.add(node.left);
            }
            index++;
            if (index<arr.length&&!arr[index].equals("null")){
                node.right=new TreeNode(Integer.parseInt(arr[index]));
                queue.add(node.right);
            }
            index++;
        }
        return root;
    }
}
