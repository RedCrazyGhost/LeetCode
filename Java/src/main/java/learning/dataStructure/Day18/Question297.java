package learning.数据结构基础.Day18;

import model.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 297. 二叉树的序列化与反序列化
 *
 * @author wenxingzhan
 * @date 2022/01/24 20:09
 **/
public class Question297 {


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return dfs(root);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list=new LinkedList<>(Arrays.asList(data.split(",")));
        return createdfs(list);
    }
    private String dfs(TreeNode node){
        if (node==null){
            return "null";
        }
        String l=dfs(node.left);
        String r=dfs(node.right);

        return node.val+","+l+","+r;
    }
    private TreeNode createdfs(List<String> list){
        if (list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        root.left=createdfs(list);
        root.right=createdfs(list);
        return root;
    }
}
