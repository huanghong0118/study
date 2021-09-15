package com.zhh.practice.algorithm.sort;

/**
 * @description:插入
 * @see:com.zhh.practice.algorithm.sort
 * @author:zhh
 * @createTime:2021-09-15 9:01
 * @version:1.0
 */
public class InsertSort {

    public static void insertSort(int[] arr){
        for(int i = 0;i < arr.length - 1;i ++){
            for(int j = i + 1;j > 0 && arr[j] < arr[j-1];j --){
                swap(arr,j,j-1);
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
        insertSort(array);
        System.out.println(array);
    }
}
