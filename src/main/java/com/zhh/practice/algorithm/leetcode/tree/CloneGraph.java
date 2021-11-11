package com.zhh.practice.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:克隆图
 * @see:com.zhh.practice.algorithm.leetcode.tree
 * @author:zhh
 * @createTime:2021-11-11 16:09
 * @version:1.0
 */
public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }


    Map<Node,Node> visited = new HashMap<>();

    public Node cloneGraphDFS(Node node) {
        if(node == null){
            return null;
        }
        if(visited.containsKey(node)){
            return visited.get(node);
        }

        Node cloneNode = new Node(node.val,new ArrayList<Node>());
        visited.put(node, cloneNode);

        for(Node neighbor : node.neighbors){
            cloneNode.neighbors.add(cloneGraphDFS(neighbor));
        }
        return cloneNode;
    }

    public Node cloneGraphBFS(Node node) {
        return null;
    }
}
