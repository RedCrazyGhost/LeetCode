package 每日一题;

import 数据结构模型.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 *
 * @author wenxingzhan
 * @date 2021/11/11 18:58
 **/
public class Question145 {

    List<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        list=new ArrayList<>();
        if(root!=null){
            function(root);
        }
        return list;

    }
    public void function(TreeNode node){
        if(node.left!=null){
            function(node.left);
        }
        if(node.right!=null){
            function(node.right);
        }
        list.add(node.val);
    }
}
