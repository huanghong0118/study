package com.zhh.practice.algorithm.leetcode.tree;

import javafx.beans.binding.When;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:判断两颗树施肥相同
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-11-11 15:31
 * @version:1.0
 */
public class IsSameTree {

      public static class TreeNode {
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

      /**
       * description 递归 深度优先遍历
       * param [p, q]
       * return boolean
       * author zhh
       * createTime 2021-11-11 15:48
       **/
    public boolean isSameTreeDFS(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else if(p.val != q.val){
            return false;
        }else{
            return isSameTreeDFS(p.left,q.left) && isSameTreeDFS(p.right,q.right);
        }
    }

    public boolean isSameTreeBFS(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }
        Queue<TreeNode> queueP = new LinkedList<>();
        Queue<TreeNode> queueQ = new LinkedList<>();
        queueP.offer(p);
        queueQ.offer(q);
        while(!queueP.isEmpty() && !queueQ.isEmpty()){
            //弹出
            TreeNode node1 = queueP.poll();
            TreeNode node2 = queueQ.poll();
            if(node1.val != node2.val){
                return false;
            }
            TreeNode left1 = node1.left;
            TreeNode right1 = node1.right;
            TreeNode left2 = node2.left;
            TreeNode right2 = node2.right;
            if(left1 == null ^ left2 == null){
                return false;
            }
            if(right1 == null ^ right2 == null){
                return false;
            }
            if(left1 != null){
                queueP.offer(left1);
            }
            if(right1 != null){
                queueP.offer(right1);
            }
            if(left2 != null){
                queueQ.offer(left2);
            }
            if(right2 != null){
                queueQ.offer(right2);
            }
        }
        return queueP.isEmpty() && queueQ.isEmpty();
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1,new TreeNode(2,null,null),new TreeNode(3,null,null));
        TreeNode b = new TreeNode(1,new TreeNode(2,null,null),new TreeNode(3,null,null));
        System.out.println(new IsSameTree().isSameTreeDFS(a, b));
    }
}
