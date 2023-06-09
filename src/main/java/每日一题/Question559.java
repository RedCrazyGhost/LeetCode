package 每日一题;

import 数据结构模型.NTreeNode;

/**
 * 559. N 叉树的最大深度
 *
 * @author wenxingzhan
 * @date 2021/11/21 13:27
 **/
public class Question559 {
    public int maxDepth(NTreeNode root) {
        if(root==null){
            return 0;
        }
       return function(root);
    }
    public int function(NTreeNode node){
        if (node.children.size()!=0) {
            int max=0;
            for (NTreeNode n: node.children
                 ) {
               max=Math.max(max, function(n));
            }
            return max+1;
        }else{
            return 1;
        }
    }
}
