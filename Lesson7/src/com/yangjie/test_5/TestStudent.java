package com.yangjie.test_5;

public class TestStudent {
    public static void main(String[] args) {
        //getClass()方法
        Student s1 = new Student("aaa",20);
        Student s2 = new Student("bbb",21);
        Class class1 = s1.getClass();
        Class class2 = s2.getClass();
        if(class1 == class2){
            System.out.println("属于同一类型");
        }else{
            System.out.println("不属于同一类型");
        }
        //hasCode()方法
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode() );
        Student s3 = s1;
        System.out.println(s3.hashCode());

        //toString()方法
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        //euals()方法，比较两个对象是否相等。
        System.out.println(s1.equals(s2));
        Student s4 = new Student("ccc",15);
        Student s5 = new Student("ccc",15);
        System.out.println(s4.equals(s5));


    }

}
