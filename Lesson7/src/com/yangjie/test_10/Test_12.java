package com.yangjie.test_10;

import java.util.Date;

public class Test_12 {
    public static void main(String[] args) {
        //1、创建时间对象
        //今天
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.toLocaleString());
        //昨天
        Date date2 = new Date(date1.getTime()-(60*60*24*1000));
        System.out.println(date2.toLocaleString());
        //2方法after before
        boolean b1 = date1.after(date2);
        System.out.println(b1);
        boolean b2 = date1.before(date2);
        System.out.println(b2);
        //比较compareTo()
        int d = date2.compareTo(date1);
        System.out.println(d);  //返回 正数 1   负数 -1   相等 0
        //比较是否相等
        boolean b3 = date2.equals(date1);
        System.out.println(b3);

    }
}
