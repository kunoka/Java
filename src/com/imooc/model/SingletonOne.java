package com.imooc.model;
//饿汉式单例模式 空间 换时间
public class SingletonOne {
    static String name = "123";
    private SingletonOne(){

    }


    static SingletonOne instance = new SingletonOne();

    public static SingletonOne getInstance() {
        name = "123";
        name = "456";
        return  instance;
    }
}
