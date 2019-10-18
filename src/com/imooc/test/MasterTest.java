package com.imooc.test;

import com.imooc.twoseven.Animal;
import com.imooc.twoseven.Cat;
import com.imooc.twoseven.Master;
import com.imooc.twoseven.Dog;

public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();
        Cat cat = new Cat();
        Dog dog = new Dog();
        master.feed(cat);
        master.feed(dog);
    }
}
