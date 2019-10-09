package com.imooc.test;

import com.imooc.model.Animal;

public class Test3 {
    public static void main(String[] args) {
        Animal one = new Animal("花花", 2);
        Animal two = new Animal("花花2", 12);
        boolean flag = one.equals(two);
        System.out.println(flag);
        String a = new String("花花");
        String b = new String("花花");
        flag = a.equals(b);
        System.out.println(flag);
        System.out.println(a==b);
        System.out.println("============");
        System.out.println(one.toString());
        System.out.println(two.toString());
    }
}
