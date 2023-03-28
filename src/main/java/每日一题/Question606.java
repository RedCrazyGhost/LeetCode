package 每日一题;

import 数据结构模型.TreeNode;

/**
 * 606. 根据二叉树创建字符串
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/03/19 17:41
 **/
public class Question606 {
    StringBuilder stringBuilder=new StringBuilder();
    public String tree2str(TreeNode root) {
        dfs(root);
        return  stringBuilder.toString();
    }
    public void dfs(TreeNode node){
        if (node!=null){
            stringBuilder.append(node.val);


            if (node.right!=null&&node.left!=null) {
                stringBuilder.append('(');
                dfs(node.left);
                stringBuilder.append(')');
                stringBuilder.append('(');
                dfs(node.right);
                stringBuilder.append(')');
            }else if (node.left != null){
                stringBuilder.append('(');
                dfs(node.left);
                stringBuilder.append(')');
            }else if (node.right != null){
                stringBuilder.append("()(");
                dfs(node.right);
                stringBuilder.append(')');
            }


        }
    }
}
