package com.zhh.practice.algorithm.leetcode.tree;


/**
 * @description:路径和等于目标值 不用以根节点开始 也不用以叶子节点结束
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-12 18:27
 * @version:1.0
 */
public class PathSum {

    public int pathSum(TreeNode root,int sum){
        if(root == null){
            return 0;
        }
        int pathSum = pathSumStartWithRoot(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
        return pathSum;
    }

    private int pathSumStartWithRoot(TreeNode root,int sum){
        if(root == null){
            return 0;
        }
        int pathSum = 0;
        if(root.val == sum){
            pathSum++;
        }
        pathSum +=  pathSumStartWithRoot(root.left,sum - root.val) + pathSumStartWithRoot(root.right,sum - root.val);
        return pathSum;
    }
}
