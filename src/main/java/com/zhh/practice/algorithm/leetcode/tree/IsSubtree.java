package com.zhh.practice.algorithm.leetcode.tree;

/**
 * @description:树t是否为树s的子树
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-04-12 18:46
 * @version:1.0
 */
public class IsSubtree {

    public boolean isSubTree(TreeNode s,TreeNode t){
        if(t == null){
            return true;
        }
        return isSubtreeWithRoot(s,t) || isSubTree(s.left,t) || isSubTree(s.right,t);
    }

    /**
     * description 比较树对应的值是否相等
     * param [s, t]
     * return boolean
     * author zhh
     * createTime 2021-04-12 18:56
     **/
    private boolean isSubtreeWithRoot(TreeNode s, TreeNode t) {
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        if(s.val != t.val){
            return false;
        }
        return isSubtreeWithRoot(s.left,t.left) && isSubtreeWithRoot(s.right,t.right);
    }
}
