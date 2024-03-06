package learning.数据结构基础.Day15;

import 数据结构模型.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 *
 * @author wenxingzhan
 * @date 2022/01/23 17:38
 **/
public class Question105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int pLen=preorder.length;
        int iLen=inorder.length;
        Map<Integer,Integer>  map=new HashMap<>(iLen);

        for (int i = 0; i < iLen; i++) {
            map.put(inorder[i],i);
        }


        return buildTree(0,pLen-1,preorder,0,iLen-1,inorder,map);
    }



    private TreeNode buildTree(int pleft,int pright,int[] preorder,int ileft,int iright, int[] inorder,Map<Integer,Integer>map){
        if (pleft>pright||ileft>iright){
            return null;
        }
        int rootvalue=preorder[pleft];
        TreeNode root=new TreeNode(rootvalue);
        int pIndex=map.get(rootvalue);

        root.left=buildTree(pleft+1,pIndex-ileft+pleft,preorder,ileft,pIndex-1,inorder,map);
        root.right=buildTree(pIndex-ileft+pleft+1,pright,preorder,pIndex+1,iright,inorder,map);

        return root;
    }
}
