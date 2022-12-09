package com.basic.www.conpter03;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-09 15:30
 */
public class Continue02 {
    public static void main(String[] args) {
        lable1:
        for (int j = 0; j < 4; j++) {
            lable2:
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    //continue;
                    //continue lable2;
                    continue lable1;
                }
                System.out.println("i=" + i);
            }
        }

    }
}
