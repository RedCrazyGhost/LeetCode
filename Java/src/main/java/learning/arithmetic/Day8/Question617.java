package learning.算法入门.Day8;

import model.TreeNode;

/**
 * 617. 合并二叉树
 *
 * @author wenxingzhan
 * @date 2022/01/01 14:15
 **/
public class Question617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return dfs(new TreeNode(),root1,root2);
    }
    public TreeNode dfs(TreeNode root,TreeNode root1, TreeNode root2){
       if (root1!=null&&root2!=null){
           root.val= root1.val+ root2.val;




           root.left=dfs(new TreeNode(),root1.left,root2.left);
           root.right=dfs(new TreeNode(),root1.right,root2.right);

       }else if(root1!=null){
           root.val= root1.val;


           root.left=dfs(new TreeNode(),root1.left,null);
           root.right=dfs(new TreeNode(),root1.right,null);

       }else if(root2!=null){
           root.val= root2.val;




           root.left=dfs(new TreeNode(),null,root2.left);
           root.right=dfs(new TreeNode(),null,root2.right);

       }else{
           return null;
       }

//        if (root1!=null&&root2!=null&&root1.left!=null&&root2.left!=null){
//            root.left=dfs(new TreeNode(),root1.left,root2.left);
//        }else if (root1!=null&&root1.left!=null){
//            root.left=dfs(new TreeNode(),root1.left,null);
//        }else if(root2!=null&&root2.left!=null){
//            root.left=dfs(new TreeNode(),null,root2.left);
//        }
//
//        if (root1!=null&&root2!=null&&root1.right!=null&&root2.right!=null){
//            root.right=dfs(new TreeNode(),root1.right,root2.right);
//        }else if (root1!=null&&root1.right!=null){
//            root.right=dfs(new TreeNode(),root1.right,null);
//        }else if(root2!=null&&root2.right!=null){
//            root.right=dfs(new TreeNode(),null,root2.right);
//        }

        return root;
    }
}
