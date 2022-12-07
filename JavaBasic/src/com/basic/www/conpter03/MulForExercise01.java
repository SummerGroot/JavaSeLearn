package com.basic.www.conpter03;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-07 11:38
 */
public class MulForExercise01 {
    public static void main(String[] args) {
        //统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分
        //成绩从键盘输入
        int count = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("请输入成绩：");
                double score = input.nextDouble();
                count += score;
            }
            System.out.println(count);
            System.out.println("班级平均分为：" + count / 5);
        }
    }
}
