package com.zhh.practice.algorithm.leetcode;

/**
 * @description:汉明距离
 * @see:com.zhh.practice.algorithm
 * @author:zhh
 * @createTime:2021-04-06 14:30
 * @version:1.0
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        //异或操作 相同为0 不同为1 即寻找1的数量
        int z = x ^ y;
        int distance = 0;
        while(z != 0){
            if(z % 2 != 0){
                distance++;
            }
            z = z >> 1;
        }
        return distance;
    }

    //优化方法
    public int hammingDistance1(int x, int y) {
        //异或操作 相同为0 不同为1 即寻找1的数量
        int z = x ^ y;
        int distance = 0;
        while(z != 0){
            distance++;
            z = z & (z - 1);
        }
        return distance;
    }

    public static void main(String[] args) {
        HammingDistance h = new HammingDistance();
        System.out.println(h.hammingDistance1(1,2));
    }
}
