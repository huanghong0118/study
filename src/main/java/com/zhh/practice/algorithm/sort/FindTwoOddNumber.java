package com.zhh.practice.algorithm.sort;

/**
 * @description:
 * @see:com.zhh.practice.algorithm.sort
 * @author:zhh
 * @createTime:2021-09-15 9:51
 * @version:1.0
 */
public class FindTwoOddNumber {

    public static void findTwoOddNumber(int[] arr){
        int eor = 0;
        for(int i : arr){
            eor ^= i;
        }
        //获取最后一个1
        int rightOne = eor & (~eor + 1);
        int onlyOne = 0;
        for(int i : arr){
            if((rightOne & i) == 0){
                onlyOne ^= i;
            }
        }
        //结果
        int a = onlyOne;
        int b = eor ^ onlyOne;
        System.out.println(a + " "+b);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,4,4,4,4,8};
        findTwoOddNumber(array);
        System.out.println(array);
    }
}
