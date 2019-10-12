package com.imooc.model;

public class Cat  {
    // 成员属性
    private String name;
    private int month;
    private double weight;
    private String species;

    // 静态 静态成员 类成员
    public static int price;
    public Cat(){
        System.out.println("我是宠物猫");
    }
    public Cat(int month){
        this.setMonth(month);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return this.month;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setSpecies(String name){
        this.species = species;
    }
    public String getSpecies(){
        return this.species;
    }
    public void run(){
        price = 20;
        eat();
//        this.name="娃娃";
        System.out.println("售价是" + this.price + "的小猫[" + this.name + "]快跑");
        System.out.println("小猫快跑");
    }
    public static void eat(){
        Cat temp = new Cat();
        temp.name = "小胖";
        price = 50;
        System.out.println(temp.name + " 小猫在吃东西");
    }
    {
        name= "234";
        price = 444;
        System.out.println("我是构造代码块1");
    }
    static {
        price = 123;
        System.out.println("我是静态构造代码块");
    }
}