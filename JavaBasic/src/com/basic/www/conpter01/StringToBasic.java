package com.basic.www.conpter01;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-23 16:38
 */
public class StringToBasic {
    public static void main(String[] args) {
        //基本->String
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4);
        //String->对应的基本数据类型
        //解读 使用基本数据类型对应的包装类，得到基本数据类型
        String s5 = "123";
        int num1 = Integer.parseInt(s5);//123
        double num2 = Double.parseDouble(s5);//123.0
        float num3 = Float.parseFloat(s5);//123.0

        System.out.println(num1 + "\t" + num2 + "\t" + num3);
    }
}
