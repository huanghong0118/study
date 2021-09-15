package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:找到最长相同路径
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-13 16:24
 * @version:1.0
 */
public class LongestUnivaluePath {

    private int path = 0;

    public int longestUnivaluePath(TreeNode root){
        dfs(root);
        return path;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int leftPath = root.left != null && root.left.val == root.val ? left + 1 : 0;
        int rightPath = root.left != null && root.left.val == root.val ? right + 1 : 0;
        path = Math.max(path,leftPath + rightPath);
        return Math.max(leftPath,rightPath);
    }
}
