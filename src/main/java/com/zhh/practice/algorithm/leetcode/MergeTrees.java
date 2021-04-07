package com.zhh.practice.algorithm.leetcode;


// Definition for a binary tree node.



/**
 * @description:合并二叉树
 * @see:com.zhh.practice.algorithm.leetcode
 * @author:zhh
 * @createTime:2021-04-07 9:33
 * @version:1.0
 */
public class MergeTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        TreeNode newNode = new TreeNode(root1.val+root2.val);
        newNode.left = mergeTrees(root1.left, root2.left);
        newNode.right = mergeTrees(root1.right, root2.right);

        return newNode;
    }
}

class TreeNode {
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