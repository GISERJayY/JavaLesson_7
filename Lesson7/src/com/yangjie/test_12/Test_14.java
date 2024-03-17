package com.yangjie.test_12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_14 {
    public static void main(String[] args) {
        //1创建SimpleDateFormat对象y年m月
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH-mm-ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //2创建Date
        Date date = new Date();
        //格式化date（把日期转换成字符）
        String str = sdf.format(date);
        System.out.println(str);
        //解析 字符串转成日期
        Date date2 = new Date("1990/05/01");
        System.out.println(date2);




    }
}
