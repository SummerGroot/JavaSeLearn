package com.basic.www.conpter04;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-27 15:56
 */
public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        /*
         * 1、从定义形式上看int[][]
         * 2、原来的一维数组的每个元素是一维数组，就构成了二维数组*/
        int[][] arr = {{0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 2, 0, 3, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        //输出二维图形
        for (int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素
            //遍历二维数组的每个元素（数组）
            /*
            arr[i]表示：二维数组的第i+1个元素 比如arr[0]：二维数组的第一个元素
            * 1、arr[i].length得到对应的 每个一维数组的长度*/
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                //输出了一维数组
            }
            System.out.println();//换行
        }
    }
}
