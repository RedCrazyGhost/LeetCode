package learning.LeetCode75.Day6;

import model.NTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N 叉树的前序遍历
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/04/01 21:23
 **/
public class Question589 {
    List<Integer>list=null;

    public List<Integer> preorder(NTreeNode root) {
        list=new ArrayList<>();
        dfs(root);
        return list;
    }

    private void dfs(NTreeNode node){
        if (node!=null) {
            list.add(node.val);
            for (NTreeNode child : node.children) {
                dfs(child);
            }
        }
    }
}
