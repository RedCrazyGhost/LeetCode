package 每日一题;

import 数据结构模型.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1305. 两棵二叉搜索树中的所有元素
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/01 12:05
 **/
public class Question1305 {
    List<Integer>list =new ArrayList<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        dfs(root1);
        dfs(root2);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        return list;
    }
    private void dfs(TreeNode node){
        if (node != null) {
            list.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    }
}
