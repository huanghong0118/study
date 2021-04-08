package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:二叉树最大深度
 * @see:com.zhh.practice.algorithm.leetcode
 * @author:zhh
 * @createTime:2021-04-07 19:07
 * @version:1.0
 */
public class MaxDepth {

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
