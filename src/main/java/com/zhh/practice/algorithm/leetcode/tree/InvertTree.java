package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:翻转一颗二叉树
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-08 10:36
 * @version:1.0
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
}
