package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:给你一个整数 n ，求恰由 n个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？
 *              返回满足题意的二叉搜索树的种数。
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2023-03-30 15:20
 * @version:1.0
 */
public class NumTrees {

    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n + 1; i++){
            for(int j = 1; j < i + 1; j++){
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}
