package com.yangjie.test_2;

public class Outer {
    private String name = "xxx";
    private int age = 18;
    static class Inner{
        private String address = "上海";
        private String phone = "111";
        //静态成员
        private  static  int count = 1000;
        public  void  show (){
            //调用外部类属性
            //1先创建外部类属性
            Outer out = new Outer();
            System.out.println(out.name);
            System.out.println(out.age);
            //用静态内部类的属性
            System.out.println(address);
            System.out.println(phone);
            //调用静态内部类的属性
            System.out.println(Inner.count);

        }
    }
}
