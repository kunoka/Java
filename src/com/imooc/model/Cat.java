package com.imooc.model;

public class Cat extends Animal {
    static{
        System.out.println("我是子类的静态方法");
    }
    {
        System.out.println("我是子类的静态代码块");
    }
    public Cat(){
        System.out.println("我是子类的无参构造方法");
    }
    public Cat(String name){
        super.eat();
        System.out.println(super.name + " 我是子类的带参构造方法");
    }
    public void eat(String name){
        System.out.println(name + "在吃东西");
    }
}