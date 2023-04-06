package com.zhh.practice.algorithm.leetcode.array;

/**
 * @description: 给你一个整数数组 nums 和一个整数 target 。
 * 向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
 * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
 * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
 * @see:com.zhh.practice.algorithm.leetcode.array
 * @author:zhh
 * @createTime:2023-04-04 17:00
 * @version:1.0
 */
public class FindTargetSumWays {

    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            sum+=nums[i];
        }
        if (Math.abs(target) > Math.abs(sum)) return 0;
        int[][] dp = new int[len][sum * 2 +1];
        dp[0][sum + nums[0]] += 1;
        dp[0][sum - nums[0]] += 1;

        for (int i = 1; i < len; i++){

            for (int j = -sum;j <= sum; j++){
                if(j + nums[i] > sum){
                    dp[i][j + sum] = dp[i - 1][j + sum - nums[i]];
                }else if(j - nums[i] < -sum){
                    dp[i][j + sum] = dp[i - 1][j + sum + nums[i]];
                }else{
                    dp[i][j + sum] = dp[i - 1][j + sum - nums[i]] + dp[i - 1][j + sum + nums[i]];
                }
            }
        }
        return dp[len - 1][sum + target];
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        int i = findTargetSumWays(nums,0);
        System.out.println(i);
    }
}
