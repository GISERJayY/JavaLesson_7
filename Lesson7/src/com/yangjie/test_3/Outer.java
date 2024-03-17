package com.yangjie.test_3;

public class Outer {
    private String name = "刘德华";
    private int  age = 35;
    public void show(){
        //局部变量：局部变量中不能有静态常量
        final String address = "深圳";
        //局部内部类：注意不能加任何修饰符
        class Inner{
            //局部内部类属性
            private   final static int count = 12345; //局部内部类只允许常量静态变量
            private String phone = "111221231";
            private  String email = "yangjie@163.com";
            public void show2(){
                //访问外部属性
                System.out.println(Outer.this.name);
                System.out.println(Outer.this.age);
                //访问内部类属性
                System.out.println(this.phone);
                System.out.println(this.email);
                //访问局部变量，jdk1.7要求：变量必须是常量final，jdk1.8自动添加final
                System.out.println(address);//等效实际的常量 深圳
                System.out.println(count);
            }
        }
                Inner inner = new Inner();
                inner.show2();
    }
}
