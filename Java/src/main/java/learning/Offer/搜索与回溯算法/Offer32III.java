package learning.Offer.搜索与回溯算法;

import 数据结构模型.TreeNode;

import java.util.*;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/06/29 18:33
 **/
public class Offer32III {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root,0);
        for(int i=1;i<list.size();i+=2){
            Collections.reverse(list.get(i));
        }
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
