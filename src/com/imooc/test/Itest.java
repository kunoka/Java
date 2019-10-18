package com.imooc.test;

import com.imooc.interfacea.IA;
import com.imooc.interfacea.IB;
import com.imooc.interfacea.Person;

public class Itest implements IA, IB {
    public static void main(String[] args) {
        IA a = new Itest();
        IB b = new Itest();
        System.out.println(a.TEMP);
        System.out.println(b.TEMP);
        IA p = new Person();
        p.eat();
        Itest t = new Itest();
        t.eat();
    }

    public void eat(){
        System.out.println("我是ITET类的中EAT");
    }
    public static void eat1() {
        System.out.println("eat function");
    }
}
