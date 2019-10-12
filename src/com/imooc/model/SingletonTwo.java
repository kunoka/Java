package com.imooc.model;
//饱汉式单例模式 时间换空间
public class SingletonTwo {
    private SingletonTwo(){

    }

    static SingletonTwo instance = null;

    public static SingletonTwo getInstance() {
        if(instance == null) {
            instance = new SingletonTwo();
        }
        return  instance;
    }
}
