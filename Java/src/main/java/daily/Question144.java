package daily;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 *
 * @author wenxingzhan
 * @date 2021/11/11 18:43
 **/
public class Question144 {
    List<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        list=new ArrayList<>();
        if (root!=null) {
            function(root);
        }
        return list;
    }

    public void function(TreeNode node){
        list.add(node.val);
        if(node.left!=null){
            function(node.left);
        }
        if (node.right!=null){
            function(node.right);
        }

    }
}
