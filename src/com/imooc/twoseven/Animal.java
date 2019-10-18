package com.imooc.twoseven;

public class Animal {
    private String name;
    private int month;

    public void Animal(){
        System.out.println("Animal的无参构造方法");
    }

    public void Animal(String name, int month){
        System.out.println("Animal的带参构造方法");
    }
    public void setName(){

    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public void eat(){
        System.out.println("动物都要吃东西");
    }
}
