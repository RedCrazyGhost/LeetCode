package 学习计划.数据结构基础.Day17;

import 数据结构模型.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 173. 二叉搜索树迭代器
 *
 * @author wenxingzhan
 * @date 2022/01/24 15:47
 **/
public class Question173 {
    List<Integer> list=null;
    ListIterator<Integer> listIterator=null;
    public Question173(TreeNode root) {
        list=new LinkedList<>();
        dfs(root);
        listIterator= list.listIterator();
    }

    public void dfs(TreeNode node){
        if(node!=null){
            dfs(node.left);
            list.add(node.val);
            dfs(node.right);
        }
    }

    public int next() {
        return listIterator.next();
    }

    public boolean hasNext() {
        return listIterator.hasNext();
    }
}
