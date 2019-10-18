package com.imooc.twoseven;

import com.imooc.test.Icall;

public class Cat extends Animal implements Icall {
    public int TEMP = 3000;
    public void Cat(){
        System.out.println("Cat 的无参构造方法");
    }
    public void call(){
            System.out.println("call");
    }
    public void Cat(String name, int month){
        System.out.println("Cat 的带参构造方法");
    }

    @Override
    public void eat(){
        System.out.println("小猫爱吃鱼");
    }

    public void planBall(){
        System.out.println("小猫爱玩线球");
    }

    public void connection(){
        Icall.super.connection();
    }
}
