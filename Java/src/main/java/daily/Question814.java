package daily;

import 数据结构模型.TreeNode;

/**
 * 814. 二叉树剪枝
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/07/21 10:24
 **/
public class Question814 {
    public TreeNode pruneTree(TreeNode root) {
        return dfs(root) ? root:null;
    }
    private boolean dfs(TreeNode node){
        boolean flag= node.val == 1;

        if(node.left!=null){
            if(!dfs(node.left)){
             node.left=null;
            }else{
                flag=true;
            }
        }
        if (node.right!=null){
            if(!dfs(node.right)) {
                node.right=null;
            }else{
                flag=true;
            }
        }

        return flag;
    }
}
