package com.yangjie.test_4;

public class TestUsb {
    public static void main(String[] args) {
       /* Usb usb = new Mouse();
        usb.service(); */
        //局部内部类
       /* class Fan implements Usb{

            @Override
            public void service() {
                System.out.println("链接电脑成功，风扇开始工作。。。。。");
            }
        }
        //使用局部内部类来创建对象
        Usb usb = new Fan();
        usb.service();*/
        //使用匿名内部类
        Usb usb = new Usb() {
            @Override
            public void service() {
                System.out.println("链接电脑成功，风扇开始工作。。。。。");
            }
        };
        usb.service();
    }
}
