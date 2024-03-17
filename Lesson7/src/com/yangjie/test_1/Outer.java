package com.yangjie.test_1;

public class Outer {
    //实例变量
    private String name = "张三";
    private int age = 20;
     //内部类
    class Inner{
        private String address = "北京";
        private String phoen = "110";
        //
         private String name = "李四";
        //方法
         public void show (){
             //打印外部类属性,内部类的属性与外部类的属性名字相同时 用Outer.this
             System.out.println(Outer.this.name);
             System.out.println(Outer.this.age);
             //打印内部类的属性
             System.out.println(this.address);
             System.out.println(this.phoen );
         }
     }
}
