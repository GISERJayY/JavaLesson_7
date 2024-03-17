package com.yangjie.test_6;

import com.sun.org.apache.xpath.internal.operations.Number;

public class test_6 {
    public static void main(String[] args) {
        //int num = 16;
        //类型转换：装箱，基本类型转成引用类型
        int num1 = 25;
        //使用Integer类创建对象
        Integer integer = new Integer(num1);
        Integer integer2 = Integer.valueOf(num1);
        System.out.println("装箱");
        System.out.println(integer);
        System.out.println(integer2);

        //类型转换：拆箱，引用类型转换为基本类型

        Integer integer3 = new Integer(100);
        int num2 = integer3.intValue();
        System.out.println("拆箱");
        System.out.println(integer3);
        System.out.println(num2);
        //jdk1.5后提供自动拆箱和装箱
        int age = 3;
        //自动装箱
        Integer integer4 = age;
        //自动拆箱
        int age2 = integer4;
        System.out.println("自动拆箱和装箱");
        System.out.println(integer4);
        System.out.println(age2);

        //基本类型和字符串之间转换。
        //1、基本类型转换成字符串
        int n1 = 100;
        //1.1使用 + 号
        String s1 = n1 + "";
        //1.2使用Integer中toString()方法
        String s2 = Integer.toString(n1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Integer.toHexString(15));
        //重载方法 toString(int i ,int radix),radix 为转换为多少进字数

        //2、字符串转基本类型
        String s3 = "1000";
        //使用Integer.parseXXX(String s)
        int n2 = Integer.parseInt(s3);
        System.out.println(n2);

        //boolean字符串转换为基本类型，“true”---->true, 非"ture"---->false
        String s4 = "true";
        String s5 = "turea";
        boolean b1 = Boolean.parseBoolean(s4);
        boolean b2 = Boolean.parseBoolean(s5);
        System.out.println(b1);
        System.out.println(b2);



    }
}
