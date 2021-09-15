package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:统计左叶子节点的和
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-13 16:11
 * @version:1.0
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root){

        if(root == null){
            return 0;
        }
        if(isLeaf(root.left)){
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    private boolean isLeaf(TreeNode node){
        if (node == null) {
            return false;
        }
        return node.left == null && node.right == null;
    }
}
