package daily;

import model.TreeNode;

/**
 * 235. 二叉搜索树的最近公共祖先
 *
 * @author wenxingzhan
 * @date 2021/11/23 11:02
 **/
public class Question235 {
    TreeNode target=null;
    boolean flag=true;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        function(root,p.val,q.val);
        return target;
    }
    public void function(TreeNode node,int p, int q) {
        if ((node.val>q&&node.val<p)||(node.val<q&&node.val>p)){
            target=node;
        } else if (node.val<q&&node.val<p){
            function(node.right,p,q);
        }else  if (node.val>q&&node.val>p){
            function(node.left,p,q);
        }else if (node.val==q){
            if (q>p){
                flag=false;
            }
            if (target==null) {
                target = node;
            }else{
               if (flag){
                   target=new TreeNode(Math.max(target.val,node.val));
               }else{
                   target=new TreeNode(Math.min(target.val,node.val));
               }
            }
        }else if (node.val==p){
            if (q<p){
                flag=true;
            }
            if (target==null){
                target=node;
            }else{
                if (flag){
                    target=new TreeNode(Math.max(target.val,node.val));
                }else{
                    target=new TreeNode(Math.min(target.val,node.val));
                }
            }
        }
    }
}
