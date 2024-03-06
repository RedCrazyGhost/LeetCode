package daily;

import model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 572. 另一棵树的子树
 *
 * @author wenxingzhan
 * @date 2022/03/16 14:34
 **/
public class Question572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean flag=false;
        while(!queue.isEmpty()){
            TreeNode node= queue.poll();
            if (node==null){
                continue;
            }
            if (node.val== subRoot.val){
                flag=isNode(node,subRoot);
            }
            if (flag){
                return true;
            }
            queue.offer(node.left);
            queue.offer(node.right);
        }
        return false;
    }
    public boolean isNode(TreeNode rootnode,TreeNode subrootnode){
        if (rootnode==null&&subrootnode==null){
            return true;
        }else if (rootnode!=null&&subrootnode!=null) {
            if (rootnode.val == subrootnode.val) {
                boolean left = isNode(rootnode.left, subrootnode.left);
                boolean right = isNode(rootnode.right, subrootnode.right);
                return left == true && right == true;
            }
        }

        return false;
    }
}
