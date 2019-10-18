package com.imooc.twoseven;

public class Master {
    //方案1: 编写方法，传入不同类型的动物，调用各自的方法
    public void feed(Cat cat){
        cat.eat();
        cat.planBall();
    }
    public void feed(Dog dog){
        dog.eat();
        dog.sleep();
    }
    // 方法2: 编写方法传入动物的父类，方法中通过类型黑的，调用指定子类的方法
//    public void feed(Animal animal){
//        animal.eat();
//        if(animal instanceof Cat){
//            ((Cat) animal).planBall();
//        }else if(animal instanceof Dog){
//            ((Dog) animal).sleep();
//        }
//    }
}
