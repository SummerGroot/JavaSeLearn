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
        //统计3个班成绩情况，每个班有5名同学，
        // 求出各个班的平均分和所有班级的平均分
        //成绩从键盘输入
        /*
         * 1、先计算一个班，5个学生的成绩，使用for
         * 1.1创建一个Scanner对象，接受用户输入
         * 1.2得到该班级的平均分，定义double count把5个学生成绩累计*/
        double count = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入：" + j + "个对学生成绩：");
                double score = input.nextDouble();
                System.out.println("成绩为：" + score);
                count += score;
            }
            //count是5个学生的总成绩
            
            System.out.println("班级平均分为：" + count / 5);
        }
        //System.out.println("年级平均分：" + count / 5);
    }
}
