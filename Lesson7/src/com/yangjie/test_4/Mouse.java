package com.yangjie.test_4;

public class Mouse implements Usb {

    @Override
    public void service() {
        System.out.println("链接电脑成功，鼠标开始工作");
    }
}
