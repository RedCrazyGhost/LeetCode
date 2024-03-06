package daily;

import 数据结构模型.FourTreeNode;

/**
 * 558. 四叉树交集
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/07/15 10:57
 **/
public class Question558 {
    public FourTreeNode intersect(FourTreeNode quadTree1, FourTreeNode quadTree2) {
        if (quadTree1.isLeaf || quadTree2.isLeaf) {
            // 两个都是叶子节点
            if (quadTree1.isLeaf && quadTree2.isLeaf) {
                return new FourTreeNode(quadTree1.val | quadTree2.val, true, null, null, null, null);
            } else {
                // 其中一个是一个不是
                if (quadTree1.isLeaf) {
                    if (quadTree1.val) {
                        return new FourTreeNode(true, true, null, null, null, null);
                    } else {
                        return quadTree2;
                    }
                } else {
                    if (quadTree2.val) {
                        return new FourTreeNode(true, true, null, null, null, null);
                    } else {
                        return quadTree1;
                    }
                }
            }
        } else {
            FourTreeNode topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
            FourTreeNode topRight = intersect(quadTree1.topRight, quadTree2.topRight);
            FourTreeNode bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
            FourTreeNode bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
            if (topLeft.val && topLeft.isLeaf && topRight.val && topRight.isLeaf && bottomLeft.val && bottomLeft.isLeaf && bottomRight.val && bottomRight.isLeaf) {
                return new FourTreeNode(true, true, null, null, null, null);
            } else {
                return new FourTreeNode(false, false, topLeft, topRight, bottomLeft, bottomRight);
            }
        }
    }

//    官方
//    public FourTreeNode intersect(FourTreeNode quadTree1, FourTreeNode quadTree2) {
//        if(quadTree1.isLeaf){
//            if (quadTree1.val){
//                return new FourTreeNode(true,true);
//            }
//            return new FourTreeNode(quadTree2.val,quadTree2.isLeaf,quadTree2.topLeft,quadTree2.topRight,quadTree2.bottomLeft,quadTree2.bottomRight);
//        }
//        if (quadTree2.isLeaf){
//            return intersect(quadTree2,quadTree1);
//        }
//        FourTreeNode o1 = intersect(quadTree1.topLeft, quadTree2.topLeft);
//        FourTreeNode o2 = intersect(quadTree1.topRight, quadTree2.topRight);
//        FourTreeNode o3 = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
//        FourTreeNode o4 = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
//        if (o1.isLeaf && o2.isLeaf && o3.isLeaf && o4.isLeaf && o1.val == o2.val && o1.val == o3.val && o1.val == o4.val){
//            return new FourTreeNode(o1.val,true);
//        }
//        return new FourTreeNode(false,false,o1,o2,o3,o4);
//    }
}
