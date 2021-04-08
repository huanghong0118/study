package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:
 * @see:com.zhh.practice.algorithm.leetcode
 * @author:zhh
 * @createTime:2021-04-07 19:07
 * @version:1.0
 */
public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
