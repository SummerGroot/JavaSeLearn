package com.basic.www.conpter03;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-09 10:27
 */
public class Stars {
    public static void main(String[] args) {
        /*
         *       *
         *      * *
         *     *   *
         *    *******
         *思路分析
         *化繁为简
         * 1、先打印矩形
         * *****
         * *****
         * *****
         * *****
         * 2、打印半个金字塔
         * *  //第一层
         * **
         * ***
         * ****
         * *****
         * */
        for (int i = 0; i <= 5; i++) {//i表示层数
            //控制打印每层星的个数
            for (int j = 1; j < 5; j++) {

            }
            System.out.println("*");
        }
    }
}
