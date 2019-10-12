package com.imooc.practice;
// 懒汉式创建 时间换空间
public class Earth {
    private Earth(){

    }

    static Earth instance = null;

    public static Earth getInstance(){
        if(instance == null) instance = new Earth();
        return instance;
    }
}
