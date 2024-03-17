package com.yangjie.test_11;

import java.util.Calendar;

public class Test_13 {
    public static void main(String[] args) {
        //1创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());
        System.out.println(calendar.getTimeInMillis());
        //2获取时间信息
        //获取年
        int year = calendar.get(Calendar.YEAR);
        //获取月
        int month = calendar.get(Calendar.MONTH);
        //日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        //小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        //分钟
        int minute = calendar.get(Calendar.MINUTE);
        //秒
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"小时"+minute+"分"+second+"秒");
        //3修改时间
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_MONTH,6);
        System.out.println(calendar1.getTime().toString());
        //4add方法修改时间
        calendar1.add(Calendar.HOUR_OF_DAY,1);
        System.out.println(calendar1.getTime().toLocaleString());
        //5补充方法
        int max = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);
        int min = calendar1.getActualMinimum(Calendar.DAY_OF_MONTH);
        System.out.println(max);
        System.out.println(min);
    }
}
