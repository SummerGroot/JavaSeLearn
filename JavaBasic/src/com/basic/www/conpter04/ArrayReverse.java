package com.basic.www.conpter04;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 16:35
 */
public class ArrayReverse {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr={11,22,33,44,55,66};
        //临时存放
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            temp=arr[i];
            arr[i] = arr[arr.length - i];
            arr[arr.length - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
