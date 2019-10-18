package com.imooc.test;

//
public interface Icall {
    public void call();
    int TEMP = 20;
    //默认方法可以带方法体
    default void connection(){
        System.out.println("我是接口中的默认方法");
    }
    static void stop(){
        System.out.println("我是接口中的静态方法");
    }
}
