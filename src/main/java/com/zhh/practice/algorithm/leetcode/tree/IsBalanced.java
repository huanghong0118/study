package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:判断一颗树是否为平衡二叉树
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-08 9:54
 * @version:1.0
 */
public class IsBalanced {

    private boolean result = true;

    public boolean isBalanced(TreeNode root){
        maxDepth(root);
        return true;
    }

    private int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if(Math.abs(l - r) > 1){
            result = false;
        }
        return 1 + Math.max(l,r);
    }
}
