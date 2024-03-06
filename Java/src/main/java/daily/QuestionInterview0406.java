package daily;

import model.TreeNode;

/**
 * 面试题 04.06. 后继者
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/05/16 17:35
 **/
public class QuestionInterview0406 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null){
            return null;
        }
        if (root.val<=p.val){
            return inorderSuccessor(root.right,p);
        }
        TreeNode node=inorderSuccessor(root.left, p);
        return node==null?root:node;
    }
}
