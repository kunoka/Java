package com.imooc.interfacea;

public interface IA {
    int TEMP = 10;

    public default void eat(){
        System.out.println("我是接口IA的 test 方法");
    }
}
