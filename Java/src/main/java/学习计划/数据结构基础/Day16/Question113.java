package 学习计划.数据结构基础.Day16;

import 数据结构模型.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 113. 路径总和 II
 *
 * @author wenxingzhan
 * @date 2022/01/21 14:58
 **/
public class Question113 {
    List<List<Integer>> list=new ArrayList<>();
    int targetSum;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.targetSum=targetSum;
        dfs(root,new ArrayList<>(),0);
        return list;
    }
    public void dfs(TreeNode node,List<Integer> list1,int nowSum){
        if (node!=null){
            list1.add(node.val);
            if (node.left!=null){
                dfs(node.left,new ArrayList<>(list1),nowSum+ node.val);
            }
            if (node.right!=null){
                dfs(node.right,new ArrayList<>(list1),nowSum+ node.val);
            }
            if (node.right==node.left&&node.right==null&&nowSum+ node.val==targetSum){
                list.add(list1);
            }
        }
    }
}
