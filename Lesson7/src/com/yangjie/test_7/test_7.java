package com.yangjie.test_7;

public class test_7 {
    public static void main(String[] args) {
        Integer integer1 = new Integer(100);
        Integer intefer2 = new Integer(100);
        System.out.println(intefer2==integer1);

        Integer integer3 = 100;
        Integer integer4 = 100;
        System.out.println(integer3==integer4);

        Integer integer5 = Integer.valueOf(200);
        Integer integer6 = Integer.valueOf(200);
        System.out.println(integer5==integer6);
    }
}
