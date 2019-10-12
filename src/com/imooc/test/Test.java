package com.imooc.test;

import com.imooc.model.SingletonOne;
import com.imooc.model.SingletonTwo;

public class Test {
    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();

        System.out.println(one==two);
        System.out.println(one);
        System.out.println(two);

        SingletonTwo one1 = SingletonTwo.getInstance();
        SingletonTwo two1 = SingletonTwo.getInstance();

        System.out.println(one1==two1);
        System.out.println(one1);
        System.out.println(two1);
    }
}
