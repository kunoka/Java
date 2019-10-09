package com.imooc.model;

public class Animal {
    public String name = "父类名字";
    public int month;

    static{
        System.out.println("我是父类的静态方法");
    }
    {
        System.out.println("我是父类的静态代码块");
    }
    Animal(){
        System.out.println("我是父类无参数构造方法1");
    }
    public void Animal(){
        System.out.println("我是父类无参数构造方法2");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "在吃东西");
    }
}
