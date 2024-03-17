package com.yangjie.test_1;
//import com.yangjie.test_1.Outer.Inner;

public class TestOuter {
    public static void main(String[] args) {
        /*//1创建外部类对象
        Outer outer = new Outer();
        //2创建内部类对象
        Outer.Inner inner = outer.new Inner();
        inner.show();*/
        //一步到位
        Outer.Inner inner = new Outer().new Inner();
        inner.show();



    }
}
