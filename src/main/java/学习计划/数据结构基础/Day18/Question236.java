package 学习计划.数据结构基础.Day18;

import 数据结构模型.TreeNode;

/**
 * 236. 二叉树的最近公共祖先
 *
 * @author wenxingzhan
 * @date 2022/01/24 17:52
 **/
public class Question236 {
    TreeNode father=null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return father;
    }
    public boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return false;
        }
        boolean lson=dfs(root.left, p, q);
        boolean rson=dfs(root.right, p, q);
        if ((lson&&rson)||((root.val== p.val||root.val==q.val)&&(lson||rson))){
            father=root;
        }
        return lson||rson||(root.val== p.val||root.val==q.val);
    }
}
