package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:二叉树路径和是否等于目标值(根节点到叶子节点)
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-08 11:18
 * @version:1.0
 */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root , int sum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && root.val == sum){
            return true;
        }
        return hasPathSum(root.left,root.val - sum) || hasPathSum(root.right,root.val - sum);
    }
}
