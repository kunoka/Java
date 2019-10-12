package com.imooc.practice;
// 饱汉式空间换时间
public class King {
    private King(){

    }

    static private King instance = new King();

    public static King getInstance(){
        return instance;
    }
}
