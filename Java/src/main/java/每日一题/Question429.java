package 每日一题;

import 数据结构模型.NTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 429. N 叉树的层序遍历
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/14 16:02
 **/

public class Question429 {

    List<List<Integer>> list=new ArrayList<>();
    
    public List<List<Integer>> levelOrder(NTreeNode root) {
//        List<List<Integer>> list=new ArrayList<>();
//        Queue<NTreeNode> queue=new ArrayDeque<>();
//        if (root==null){
//            return list;
//        }
//        queue.offer(root);
//        int levellen=1,nextlen=0;
//        List<Integer> list1=new ArrayList<>();
//        while(!queue.isEmpty()){
//            NTreeNode node=queue.poll();
//            if (node!=null) {
//                levellen-=1;
//                list1.add(node.val);
//                if (node.children!=null) {
//                    nextlen+=node.children.size();
//                    for (NTreeNode node0 : node.children) {
//                        queue.offer(node0);
//                    }
//                }
//                if (levellen==0) {
//                    list.add(new ArrayList<>(list1));
//                    list1.clear();
//                    levellen=nextlen;
//                    nextlen=0;
//                }
//            }
//        }
//        return list;
        if (root!=null){
            dfs(root,1);
        }return list;
    }
    public void dfs(NTreeNode node,int level){
        if (level>=list.size()) list.add(new ArrayList<>());
        list.get(level).add(node.val);
        for (NTreeNode nextNode:node.children) {
            dfs(nextNode,level+1);
        }
    }
}
