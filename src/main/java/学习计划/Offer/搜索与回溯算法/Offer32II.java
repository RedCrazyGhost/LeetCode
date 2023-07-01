package 学习计划.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/29 18:25
 **/
public class Offer32II {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root,0);
        return list;
    }

    private void dfs(TreeNode node,int depth){
        if (node!=null){
            if (list.size()==depth){
                list.add(new ArrayList<>());
            }
            List<Integer> dList = list.get(depth);
            dList.add(node.val);
            if (node.left!=null){
                dfs(node.left,depth+1);
            }
            if (node.right!=null){
                dfs(node.right,depth+1);
            }
        }
    }
}
