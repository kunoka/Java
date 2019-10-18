package com.imooc.twoseven;

public class Dog extends Animal {
    public void Dog(){
        System.out.println("Dog 的无参构造方法");
    }
    public void Dog(String name, int month){
        System.out.println("Dog 的带参构造方法");
    }
    @Override
    public void eat(){
        System.out.println("小狗爱吃骨头");
    }
    public void sleep(){
        System.out.println("小狗要睡觉");
    }
}
