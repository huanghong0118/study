package com.zhh.practice.algorithm.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: 存在重复元素
 * @see:com.zhh.practice.algorithm.leetcode.array
 * @author:zhh
 * @createTime:2022-09-27 14:37
 * @version:1.0
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    /**
     * description 寻找这个重复的数 且空间复杂度为O(1)
     * param [nums]
     * return int
     * author zhh
     * createTime 2022-09-27 14:44
     **/
    public int findDuplicate(int[] nums) {
        return 0;
    }
}
