package com.yangjie.test_8;

import javax.tools.JavaCompiler;
import java.util.Arrays;

public class Test_9 {
    public static void main(String[] args) {
        String name = "hello"; //hello存在字符串常量池中。
        name = "zhangsan"; //zhangsan赋值给name，给字符串赋值时，并没有修改数据，而是重新开辟一个空间
        String name2 = "zhangsan"; //
        System.out.println(name == name2); //ture
        //演示字符串的另一种创建方式，new String();
        String str = new String("java");
        String str2 = new String("java");
        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        System.out.println("---------------字符串方法的使用1-------------------");

        //字符串方法使用
        //1、Length()；返回字符串的长度。
        //2、charAt(int index)；返回某个位置的字符串。
        //3、contains(String str)；判读是否包含某个字符串。
        String content = "Java是世界最好Java的语言,Java真香";
        System.out.println(content.length());
        System.out.println(content.charAt(0));
        System.out.println(content.contains("Java"));

        System.out.println("---------------字符串方法的使用2-------------------");
        //字符串方法使用
        //4、toCharArray()；返回字符串对应的数组
        //5、indexOf();返回子字符串首次出现位置
        //6、lastIndexOf()；返回字符串最后出现的位置
        System.out.println(Arrays.toString(content.toCharArray()));
        System.out.println(content.indexOf("Java"));
        System.out.println(content.indexOf("Java",4));
        System.out.println(content.lastIndexOf("Java"));

        System.out.println("---------------字符串方法的使用3-------------------");
        //字符串方法使用
        //7、trim()；去掉字符串后的空格
        //8、toUpperCass();把小写转成大写，toLowerCass()；把大写转成小写
        //9、endWith(str)；判读是否已str结尾，startWith(str)；判读是否已str开头。
        String content2 = "  Hello World    ";
        System.out.println(content2.trim());
        System.out.println(content2.toUpperCase());
        System.out.println(content2.toLowerCase());
        String filename = "hello.java";
        System.out.println(filename.endsWith(".java"));

        System.out.println("---------------字符串方法的使用4-------------------");
        //字符串方法使用
        //7、replace(char old,char new)；用新的字符或字符串替换旧的字符或字符串
        //8、split();对字符串进行拆分
        System.out.println(content.replace("Java","PHP"));
        String say = "java is the best   programing,language";
        String[] arr = say.split("[ ,]+");
        System.out.println(arr.length);
        for (String string : arr){
            System.out.println(string);
        }
        //补充两个方法equals(),compare();比较大小
        System.out.println("---------------补充-------------------");
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String S3 = "abc";//97
        String S4 = "xyz";//120
        System.out.println(S3.compareTo(S4));

        String S5 = "abc";
        String S6 = "abcxyz";
        System.out.println(S5.compareTo(S6)); //比较长度

    }
}
