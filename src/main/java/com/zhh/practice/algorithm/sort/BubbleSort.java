package com.zhh.practice.algorithm.sort;

import java.util.Arrays;

/**
 * @description:
 * @see:com.zhh.practice.algorithm.sort
 * @author:zhh
 * @createTime:2021-09-08 8:55
 * @version:1.0
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 1;j < arr.length - i;j++){
                if(arr[j] < arr[j-1]){
                    //交换
                    swap(arr,j,j-1);
                }
            }
        }
    }

    private static void swap(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,7,5,10,9,8,4};
        bubbleSort(array);
        System.out.println(array);
    }
}
