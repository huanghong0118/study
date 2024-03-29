package com.zhh.practice.algorithm.sort;

/**
 * @description:选择排序
 * @see:com.zhh.practice.algorithm.sort
 * @author:zhh
 * @createTime:2021-09-15 8:51
 * @version:1.0
 */
public class SelectSort {

    public static void selectSort(int[] arr){
        for(int i = arr.length - 1;i > 0;i--){
            for(int j = 0;j < i;j++){
                if(arr[j+1] < arr[j]){
                    swap(arr,j,j+1);
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
        selectSort(array);
        System.out.println(array);
    }
}
