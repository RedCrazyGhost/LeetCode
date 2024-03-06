package daily;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * @author wenxingzhan
 * @date 2021/11/11 18:55
 **/
public class Question94 {
    List<Integer> list;

    public List<Integer> inorderTraversal(TreeNode root) {
        list=new ArrayList<>();
        if (root!=null) {
            function(root);
        }


        return list;
    }
    public void function(TreeNode node){
        if(node.left!=null){
            function(node.left);
        }
        list.add(node.val);
        if(node.right!=null){
            function(node.right);
        }
    }
}
