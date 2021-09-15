package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:树的根节点到叶子节点的最小路径长度
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-13 15:51
 * @version:1.0
 */
public class MinPath {

    public int minPath(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = minPath(root.left);
        int right = minPath(root.right);

        if(left == 0 || right == 0){
            return left + right + 1;
        }
        return Math.min(left,right) + 1;
    }
}
