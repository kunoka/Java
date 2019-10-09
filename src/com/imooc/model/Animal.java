package com.imooc.model;

public class Animal {
    public String name = "父类名字";
    public int month;

    static {
        System.out.println("我是父类的静态方法");
    }

    {
        System.out.println("我是父类的静态代码块");
    }

    public Animal() {
        System.out.println("我是父类无参数构造方2");
    }

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
        System.out.println("我是父类的带参构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void eat() {
        System.out.println(name + "在吃东西");
    }

    public boolean equals(Object obj) {
        System.out.println("1111");
        if (obj == null) {
            return false;
        }
        Animal b = (Animal) obj;
        if (this.getName() == b.getName() && this.getMonth() == b.getMonth()) return true;
        else return false;
    }

    public boolean equals(Animal obj) {
        System.out.println("222");
        if (obj == null) {
            return false;
        }
        if (this.getName() == obj.getName() && this.getMonth() == obj.getMonth()) return true;
        else return false;
    }
    public String toString(){
        return "名字: " + name + "    月份: " + month;
    }
}
