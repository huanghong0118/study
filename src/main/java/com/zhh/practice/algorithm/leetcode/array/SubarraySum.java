package com.zhh.practice.algorithm.leetcode.array;

/**
 * @description:给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的连续子数组的个数 。
 * @see:com.zhh.practice.algorithm.leetcode.array
 * @author:zhh
 * @createTime:2023-03-30 15:55
 * @version:1.0
 */
public class SubarraySum {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            int sum = 0;
            for(int j = i;j >= 0; j--){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        subarraySum(nums,3);
    }
}
