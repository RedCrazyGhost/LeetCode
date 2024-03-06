package model;

import java.util.LinkedList;
import java.util.Queue;

/**
 * TreeNode
 *
 * @author wenxingzhan
 * @date 2021/11/11 18:44
 **/
public class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

//    字符串构建二叉树 存在[]不指向null
    public TreeNode(String data){
        if (data.equals("[]")) return ;
        int index=0;
        String[] arr = data.substring(1, data.length() - 1).split(",");
        this.val=Integer.parseInt(arr[index++]);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(this);
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
    }


    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
