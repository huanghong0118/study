package com.zhh.practice.algorithm.leetcode;

import java.util.Stack;

/**
 * @description:
 * @see:com.zhh.practice.algorithm.leetcode
 * @author:zhh
 * @createTime:2022-03-18 18:50
 * @version:1.0
 */
public class Palindrome {
    public static boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode cur = head;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        cur = head;
        while(!stack.empty() && cur != null){
            if(stack.pop().val != cur.val){
                return false;
            }
            cur = cur.next;
        }
        return true;
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode ls = null;
        ListNode le = null;

        ListNode es = null;
        ListNode ee = null;

        ListNode rs = null;
        ListNode re = null;

        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = null;
            if(head.val < x){
                if(ls == null){
                    ls = head;
                    le = head;
                }else{
                    le.next = head;
                    le = head;
                }
            }else if(head.val == x){
                if(es == null){
                    es = head;
                    ee = head;
                }else{
                    es.next = head;
                    ee = head;
                }
            }else if(head.val > x){
                if(rs == null){
                    rs = head;
                    re = head;
                }else{
                    rs.next = head;
                    re = head;
                }
            }
            head = next;
        }
        if(le != null){
            le.next = es;
            ee = ee != null ? ee : le;
        }
        if(ee != null){
            ee.next = rs;
        }
        return ls != null ? ls : (es != null ? es : rs);
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(partition(node1,3));

    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}