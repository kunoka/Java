package com.imooc.interfacea;

public interface IB {
    String TEMP = "temp";
    public default void eat(){
        System.out.println("我是接口IB的 test 方法");
    }
}
