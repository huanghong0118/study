package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:给定一颗二叉树 检查是否是镜像对称的
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-12 19:01
 * @version:1.0
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmetric(left.left,right.right) &&isSymmetric(left.right,right.left);
    }
}
