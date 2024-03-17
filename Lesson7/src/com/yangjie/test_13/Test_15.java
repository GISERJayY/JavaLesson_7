package com.yangjie.test_13;

public class Test_15 {
    public static void main(String[] args) {
        //arraycopu: 数组的复制
        //src：原数组
        //srcPos：从哪个位置开始复制
        //dest：目标数组
        //destPos：目标数组的位置
        //length：复制的长度
        int[] arr = {1,2,3,4,5,6,7,8,8,9};
        int[] dest = new int[8];
        System.arraycopy(arr,4,dest,3,4); // 本地方法 源码 public static native void arrarycopy(....)
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
        System.out.println(System.currentTimeMillis());
        long star = System.currentTimeMillis();
        for (int i = -999999; i <9999999 ; i++) {
            for (int j = -999999; j <9999999 ; j++) {
                int result = i + j;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("用时"+(end-star));
       //垃圾回收
        new Student("aaa",12);
        new Student("ccc",12);
        new Student("bbb",12);
        System.gc();//告诉垃圾回收

        //退出jvm
        System.exit(0);
        System.out.println("程序结束了");

    }
}
